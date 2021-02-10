// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package amazonsqsconnector.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the AmazonSQSConnector module
	public static boolean afterStartup(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "AmazonSQSConnector.AfterStartup", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean bCo_AwsConfig(IContext context, amazonsqsconnector.proxies.AwsConfig _awsConfig)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("AwsConfig", _awsConfig == null ? null : _awsConfig.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "AmazonSQSConnector.BCo_AwsConfig", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static amazonsqsconnector.proxies.QueueAttributes dS_GetQueueAttributes(IContext context, amazonsqsconnector.proxies.Queue _queue)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Queue", _queue == null ? null : _queue.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "AmazonSQSConnector.DS_GetQueueAttributes", params);
			return result == null ? null : amazonsqsconnector.proxies.QueueAttributes.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<amazonsqsconnector.proxies.Queue> dS_GetQueues(IContext context, amazonsqsconnector.proxies.AwsConfig _awsConfig)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("AwsConfig", _awsConfig == null ? null : _awsConfig.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "AmazonSQSConnector.DS_GetQueues", params);
			java.util.List<amazonsqsconnector.proxies.Queue> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<amazonsqsconnector.proxies.Queue>();
				for (IMendixObject obj : objs)
					result.add(amazonsqsconnector.proxies.Queue.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<amazonsqsconnector.proxies.Message> dS_Receive10MessagesFromQueue(IContext context, amazonsqsconnector.proxies.Queue _queue)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Queue", _queue == null ? null : _queue.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "AmazonSQSConnector.DS_Receive10MessagesFromQueue", params);
			java.util.List<amazonsqsconnector.proxies.Message> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<amazonsqsconnector.proxies.Message>();
				for (IMendixObject obj : objs)
					result.add(amazonsqsconnector.proxies.Message.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_CreateQueue(IContext context, amazonsqsconnector.proxies.CreateQueueRequest _createQueueRequest)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("CreateQueueRequest", _createQueueRequest == null ? null : _createQueueRequest.getMendixObject());
			Core.execute(context, "AmazonSQSConnector.IVK_CreateQueue", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_CreateQueueRequest(IContext context, amazonsqsconnector.proxies.AwsConfig _awsConfig)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("AwsConfig", _awsConfig == null ? null : _awsConfig.getMendixObject());
			Core.execute(context, "AmazonSQSConnector.IVK_CreateQueueRequest", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_DeleteMessage(IContext context, amazonsqsconnector.proxies.Message _message)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Message", _message == null ? null : _message.getMendixObject());
			Core.execute(context, "AmazonSQSConnector.IVK_DeleteMessage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_DeleteQueue(IContext context, amazonsqsconnector.proxies.Queue _queue)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Queue", _queue == null ? null : _queue.getMendixObject());
			Core.execute(context, "AmazonSQSConnector.IVK_DeleteQueue", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_GetSingleMessage(IContext context, amazonsqsconnector.proxies.Queue _queue, amazonsqsconnector.proxies.AwsConfig _config)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Queue", _queue == null ? null : _queue.getMendixObject());
			params.put("Config", _config == null ? null : _config.getMendixObject());
			Core.execute(context, "AmazonSQSConnector.IVK_GetSingleMessage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_OpenReceive10Messages(IContext context, amazonsqsconnector.proxies.Queue _queue)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Queue", _queue == null ? null : _queue.getMendixObject());
			Core.execute(context, "AmazonSQSConnector.IVK_OpenReceive10Messages", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_PurgeQueue(IContext context, amazonsqsconnector.proxies.Queue _queue, amazonsqsconnector.proxies.AwsConfig _awsConfig)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Queue", _queue == null ? null : _queue.getMendixObject());
			params.put("AwsConfig", _awsConfig == null ? null : _awsConfig.getMendixObject());
			Core.execute(context, "AmazonSQSConnector.IVK_PurgeQueue", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SendMessage(IContext context, amazonsqsconnector.proxies.SendMessageRequest _sendMessageRequest)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("SendMessageRequest", _sendMessageRequest == null ? null : _sendMessageRequest.getMendixObject());
			Core.execute(context, "AmazonSQSConnector.IVK_SendMessage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SendMessageRequest(IContext context, amazonsqsconnector.proxies.AwsConfig _awsConfig, amazonsqsconnector.proxies.Queue _queue)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("AwsConfig", _awsConfig == null ? null : _awsConfig.getMendixObject());
			params.put("Queue", _queue == null ? null : _queue.getMendixObject());
			Core.execute(context, "AmazonSQSConnector.IVK_SendMessageRequest", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}