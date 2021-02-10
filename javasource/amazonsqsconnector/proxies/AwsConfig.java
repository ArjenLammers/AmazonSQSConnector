// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package amazonsqsconnector.proxies;

public class AwsConfig
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject awsConfigMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AmazonSQSConnector.AwsConfig";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Identifier("Identifier"),
		AccessKey("AccessKey"),
		SecretKey("SecretKey"),
		RegionName("RegionName"),
		SelectedRegion("AmazonSQSConnector.SelectedRegion");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public AwsConfig(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "AmazonSQSConnector.AwsConfig"));
	}

	protected AwsConfig(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject awsConfigMendixObject)
	{
		if (awsConfigMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("AmazonSQSConnector.AwsConfig", awsConfigMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a AmazonSQSConnector.AwsConfig");

		this.awsConfigMendixObject = awsConfigMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AwsConfig.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static amazonsqsconnector.proxies.AwsConfig initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return amazonsqsconnector.proxies.AwsConfig.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static amazonsqsconnector.proxies.AwsConfig initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new amazonsqsconnector.proxies.AwsConfig(context, mendixObject);
	}

	public static amazonsqsconnector.proxies.AwsConfig load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return amazonsqsconnector.proxies.AwsConfig.initialize(context, mendixObject);
	}

	public static java.util.List<amazonsqsconnector.proxies.AwsConfig> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<amazonsqsconnector.proxies.AwsConfig> result = new java.util.ArrayList<amazonsqsconnector.proxies.AwsConfig>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//AmazonSQSConnector.AwsConfig" + xpathConstraint))
			result.add(amazonsqsconnector.proxies.AwsConfig.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Identifier
	 */
	public final java.lang.String getIdentifier()
	{
		return getIdentifier(getContext());
	}

	/**
	 * @param context
	 * @return value of Identifier
	 */
	public final java.lang.String getIdentifier(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Identifier.toString());
	}

	/**
	 * Set value of Identifier
	 * @param identifier
	 */
	public final void setIdentifier(java.lang.String identifier)
	{
		setIdentifier(getContext(), identifier);
	}

	/**
	 * Set value of Identifier
	 * @param context
	 * @param identifier
	 */
	public final void setIdentifier(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String identifier)
	{
		getMendixObject().setValue(context, MemberNames.Identifier.toString(), identifier);
	}

	/**
	 * @return value of AccessKey
	 */
	public final java.lang.String getAccessKey()
	{
		return getAccessKey(getContext());
	}

	/**
	 * @param context
	 * @return value of AccessKey
	 */
	public final java.lang.String getAccessKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AccessKey.toString());
	}

	/**
	 * Set value of AccessKey
	 * @param accesskey
	 */
	public final void setAccessKey(java.lang.String accesskey)
	{
		setAccessKey(getContext(), accesskey);
	}

	/**
	 * Set value of AccessKey
	 * @param context
	 * @param accesskey
	 */
	public final void setAccessKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String accesskey)
	{
		getMendixObject().setValue(context, MemberNames.AccessKey.toString(), accesskey);
	}

	/**
	 * @return value of SecretKey
	 */
	public final java.lang.String getSecretKey()
	{
		return getSecretKey(getContext());
	}

	/**
	 * @param context
	 * @return value of SecretKey
	 */
	public final java.lang.String getSecretKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SecretKey.toString());
	}

	/**
	 * Set value of SecretKey
	 * @param secretkey
	 */
	public final void setSecretKey(java.lang.String secretkey)
	{
		setSecretKey(getContext(), secretkey);
	}

	/**
	 * Set value of SecretKey
	 * @param context
	 * @param secretkey
	 */
	public final void setSecretKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String secretkey)
	{
		getMendixObject().setValue(context, MemberNames.SecretKey.toString(), secretkey);
	}

	/**
	 * @return value of RegionName
	 */
	public final java.lang.String getRegionName()
	{
		return getRegionName(getContext());
	}

	/**
	 * @param context
	 * @return value of RegionName
	 */
	public final java.lang.String getRegionName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.RegionName.toString());
	}

	/**
	 * Set value of RegionName
	 * @param regionname
	 */
	public final void setRegionName(java.lang.String regionname)
	{
		setRegionName(getContext(), regionname);
	}

	/**
	 * Set value of RegionName
	 * @param context
	 * @param regionname
	 */
	public final void setRegionName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String regionname)
	{
		getMendixObject().setValue(context, MemberNames.RegionName.toString(), regionname);
	}

	/**
	 * @return value of SelectedRegion
	 */
	public final amazonsqsconnector.proxies.Region getSelectedRegion() throws com.mendix.core.CoreException
	{
		return getSelectedRegion(getContext());
	}

	/**
	 * @param context
	 * @return value of SelectedRegion
	 */
	public final amazonsqsconnector.proxies.Region getSelectedRegion(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		amazonsqsconnector.proxies.Region result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SelectedRegion.toString());
		if (identifier != null)
			result = amazonsqsconnector.proxies.Region.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SelectedRegion
	 * @param selectedregion
	 */
	public final void setSelectedRegion(amazonsqsconnector.proxies.Region selectedregion)
	{
		setSelectedRegion(getContext(), selectedregion);
	}

	/**
	 * Set value of SelectedRegion
	 * @param context
	 * @param selectedregion
	 */
	public final void setSelectedRegion(com.mendix.systemwideinterfaces.core.IContext context, amazonsqsconnector.proxies.Region selectedregion)
	{
		if (selectedregion == null)
			getMendixObject().setValue(context, MemberNames.SelectedRegion.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SelectedRegion.toString(), selectedregion.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return awsConfigMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final amazonsqsconnector.proxies.AwsConfig that = (amazonsqsconnector.proxies.AwsConfig) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "AmazonSQSConnector.AwsConfig";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
