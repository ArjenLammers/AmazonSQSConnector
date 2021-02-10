// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package amazonsqsconnector.actions;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class ExecuteMicroflowInSeparateTransaction extends CustomJavaAction<IMendixObject>
{
	private java.lang.String microflow;
	private java.lang.String microflowArgumentEntity;
	private IMendixObject microflowArgument;
	private java.lang.String microflowReturnType;

	public ExecuteMicroflowInSeparateTransaction(IContext context, java.lang.String microflow, java.lang.String microflowArgumentEntity, IMendixObject microflowArgument, java.lang.String microflowReturnType)
	{
		super(context);
		this.microflow = microflow;
		this.microflowArgumentEntity = microflowArgumentEntity;
		this.microflowArgument = microflowArgument;
		this.microflowReturnType = microflowReturnType;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		IMendixObject result = null;
		IContext context = getContext().getSession().createContext();
		context.startTransaction();
		try {
			Object r;
			if (this.microflowArgument != null) {
				r = Core.execute(context, microflow, microflowArgument);
			} else {
				r = Core.execute(context, microflow); 
			}
			if (r != null && r instanceof IMendixObject) {
				result = (IMendixObject) r;
			}
		} finally {
			while (context.isInTransaction()) {
				context.endTransaction();
			}
		}
		return result;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ExecuteMicroflowInSeparateTransaction";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
