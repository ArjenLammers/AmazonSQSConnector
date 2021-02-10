// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package amazonsqsconnector.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import amazonsqsconnector.AmazonHelper;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.DeleteQueueRequest;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class DeleteQueue extends CustomJavaAction<java.lang.Void>
{
	private java.lang.String queueUrl;
	private IMendixObject __config;
	private amazonsqsconnector.proxies.AwsConfig config;

	public DeleteQueue(IContext context, java.lang.String queueUrl, IMendixObject config)
	{
		super(context);
		this.queueUrl = queueUrl;
		this.__config = config;
	}

	@java.lang.Override
	public java.lang.Void executeAction() throws Exception
	{
		this.config = __config == null ? null : amazonsqsconnector.proxies.AwsConfig.initialize(getContext(), __config);

		// BEGIN USER CODE
		SqsClient sqs = AmazonHelper.getSqsClient(config);
		
		DeleteQueueRequest req = DeleteQueueRequest.builder().queueUrl(queueUrl).build();
		sqs.deleteQueue(req);
		
		return null;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "DeleteQueue";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
