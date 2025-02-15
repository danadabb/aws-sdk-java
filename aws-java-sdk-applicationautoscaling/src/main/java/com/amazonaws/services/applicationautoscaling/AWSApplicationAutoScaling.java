/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.applicationautoscaling;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.applicationautoscaling.model.*;

/**
 * Interface for accessing Application Auto Scaling.
 * <p>
 * <p>
 * Application Auto Scaling is a general purpose Auto Scaling service for
 * supported elastic AWS resources. With Application Auto Scaling, you can
 * automatically scale your AWS resources, with an experience similar to that of
 * Auto Scaling.
 * </p>
 * <p>
 * Application Auto Scaling supports scaling the following AWS resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Amazon ECS services
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EC2 Spot fleet instances
 * </p>
 * </li>
 * </ul>
 * <p>
 * You can use Application Auto Scaling to accomplish the following tasks:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Define scaling policies for automatically adjusting your AWS resources
 * </p>
 * </li>
 * <li>
 * <p>
 * Scale your resources in response to CloudWatch alarms
 * </p>
 * </li>
 * <li>
 * <p>
 * View history of your scaling events
 * </p>
 * </li>
 * </ul>
 * <p>
 * Application Auto Scaling is available in the following regions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>us-east-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>us-west-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>us-west-2</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ap-southeast-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ap-southeast-2</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ap-northeast-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>eu-central-1</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>eu-west-1</code>
 * </p>
 * </li>
 * </ul>
 */
public interface AWSApplicationAutoScaling {

    /**
     * The region metadata service name for computing region endpoints. You can
     * use this value to retrieve metadata (such as supported regions) of the
     * service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "autoscaling";

    /**
     * Overrides the default endpoint for this client
     * ("https://autoscaling.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "autoscaling.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://autoscaling.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "autoscaling.us-east-1.amazonaws.com") or a full
     *        URL, including the protocol (ex:
     *        "https://autoscaling.us-east-1.amazonaws.com") of the region
     *        specific AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSApplicationAutoScaling#setEndpoint(String)},
     * sets the regional endpoint for this client's service calls. Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Deletes an Application Auto Scaling scaling policy that was previously
     * created. If you are no longer using a scaling policy, you can delete it
     * with this operation.
     * </p>
     * <p>
     * Deleting a policy deletes the underlying alarm action, but does not
     * delete the CloudWatch alarm associated with the scaling policy, even if
     * it no longer has an associated action.
     * </p>
     * <p>
     * To create a new scaling policy or update an existing one, see
     * <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     * @return Result of the DeleteScalingPolicy operation returned by the
     *         service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the
     *         available parameters for the API request.
     * @throws ObjectNotFoundException
     *         The specified object could not be found. For any <code>Put</code>
     *         or <code>Register</code> API operation, which depends on the
     *         existence of a scalable target, this exception is thrown if the
     *         scalable target with the specified service namespace, resource
     *         ID, and scalable dimension does not exist. For any
     *         <code>Delete</code> or <code>Deregister</code> API operation,
     *         this exception is thrown if the resource that is to be deleted or
     *         deregistered cannot be found.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you
     *         request an update to an Application Auto Scaling resource that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.DeleteScalingPolicy
     */
    DeleteScalingPolicyResult deleteScalingPolicy(
            DeleteScalingPolicyRequest deleteScalingPolicyRequest);

    /**
     * <p>
     * Deregisters a scalable target that was previously registered. If you are
     * no longer using a scalable target, you can delete it with this operation.
     * When you deregister a scalable target, all of the scaling policies that
     * are associated with that scalable target are deleted.
     * </p>
     * <p>
     * To create a new scalable target or update an existing one, see
     * <a>RegisterScalableTarget</a>.
     * </p>
     * 
     * @param deregisterScalableTargetRequest
     * @return Result of the DeregisterScalableTarget operation returned by the
     *         service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the
     *         available parameters for the API request.
     * @throws ObjectNotFoundException
     *         The specified object could not be found. For any <code>Put</code>
     *         or <code>Register</code> API operation, which depends on the
     *         existence of a scalable target, this exception is thrown if the
     *         scalable target with the specified service namespace, resource
     *         ID, and scalable dimension does not exist. For any
     *         <code>Delete</code> or <code>Deregister</code> API operation,
     *         this exception is thrown if the resource that is to be deleted or
     *         deregistered cannot be found.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you
     *         request an update to an Application Auto Scaling resource that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.DeregisterScalableTarget
     */
    DeregisterScalableTargetResult deregisterScalableTarget(
            DeregisterScalableTargetRequest deregisterScalableTargetRequest);

    /**
     * <p>
     * Provides descriptive information for scalable targets with a specified
     * service namespace.
     * </p>
     * <p>
     * You can filter the results in a service namespace with the
     * <code>ResourceIds</code> and <code>ScalableDimension</code> parameters.
     * </p>
     * <p>
     * To create a new scalable target or update an existing one, see
     * <a>RegisterScalableTarget</a>. If you are no longer using a scalable
     * target, you can deregister it with <a>DeregisterScalableTarget</a>.
     * </p>
     * 
     * @param describeScalableTargetsRequest
     * @return Result of the DescribeScalableTargets operation returned by the
     *         service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the
     *         available parameters for the API request.
     * @throws InvalidNextTokenException
     *         The next token supplied was invalid.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you
     *         request an update to an Application Auto Scaling resource that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.DescribeScalableTargets
     */
    DescribeScalableTargetsResult describeScalableTargets(
            DescribeScalableTargetsRequest describeScalableTargetsRequest);

    /**
     * <p>
     * Provides descriptive information for scaling activities with a specified
     * service namespace for the previous six weeks.
     * </p>
     * <p>
     * You can filter the results in a service namespace with the
     * <code>ResourceId</code> and <code>ScalableDimension</code> parameters.
     * </p>
     * <p>
     * Scaling activities are triggered by CloudWatch alarms that are associated
     * with scaling policies. To view the existing scaling policies for a
     * service namespace, see <a>DescribeScalingPolicies</a>. To create a new
     * scaling policy or update an existing one, see <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     * @return Result of the DescribeScalingActivities operation returned by the
     *         service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the
     *         available parameters for the API request.
     * @throws InvalidNextTokenException
     *         The next token supplied was invalid.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you
     *         request an update to an Application Auto Scaling resource that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.DescribeScalingActivities
     */
    DescribeScalingActivitiesResult describeScalingActivities(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest);

    /**
     * <p>
     * Provides descriptive information for scaling policies with a specified
     * service namespace.
     * </p>
     * <p>
     * You can filter the results in a service namespace with the
     * <code>ResourceId</code>, <code>ScalableDimension</code>, and
     * <code>PolicyNames</code> parameters.
     * </p>
     * <p>
     * To create a new scaling policy or update an existing one, see
     * <a>PutScalingPolicy</a>. If you are no longer using a scaling policy, you
     * can delete it with <a>DeleteScalingPolicy</a>.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
     * @return Result of the DescribeScalingPolicies operation returned by the
     *         service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the
     *         available parameters for the API request.
     * @throws FailedResourceAccessException
     *         Failed access to resources caused an exception. This exception
     *         currently only applies to <a>DescribeScalingPolicies</a>. It is
     *         thrown when Application Auto Scaling is unable to retrieve the
     *         alarms associated with a scaling policy due to a client error,
     *         for example, if the role ARN specified for a scalable target does
     *         not have the proper permissions to call the CloudWatch <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_DescribeAlarms.html"
     *         >DescribeAlarms</a> API operation on behalf of your account.
     * @throws InvalidNextTokenException
     *         The next token supplied was invalid.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you
     *         request an update to an Application Auto Scaling resource that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.DescribeScalingPolicies
     */
    DescribeScalingPoliciesResult describeScalingPolicies(
            DescribeScalingPoliciesRequest describeScalingPoliciesRequest);

    /**
     * <p>
     * Creates or updates a policy for an existing Application Auto Scaling
     * scalable target. Each scalable target is identified by service namespace,
     * a resource ID, and a scalable dimension, and a scaling policy applies to
     * a scalable target that is identified by those three attributes. You
     * cannot create a scaling policy without first registering a scalable
     * target with <a>RegisterScalableTarget</a>.
     * </p>
     * <p>
     * To update an existing policy, use the existing policy name and set the
     * parameters you want to change. Any existing parameter not changed in an
     * update to an existing policy is not changed in this update request.
     * </p>
     * <p>
     * You can view the existing scaling policies for a service namespace with
     * <a>DescribeScalingPolicies</a>. If you are no longer using a scaling
     * policy, you can delete it with <a>DeleteScalingPolicy</a>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     * @return Result of the PutScalingPolicy operation returned by the service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the
     *         available parameters for the API request.
     * @throws LimitExceededException
     *         Your account exceeded a limit. This exception is thrown when a
     *         per-account resource limit is exceeded. For more information, see
     *         <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_as-app"
     *         >Application Auto Scaling Limits</a>.
     * @throws ObjectNotFoundException
     *         The specified object could not be found. For any <code>Put</code>
     *         or <code>Register</code> API operation, which depends on the
     *         existence of a scalable target, this exception is thrown if the
     *         scalable target with the specified service namespace, resource
     *         ID, and scalable dimension does not exist. For any
     *         <code>Delete</code> or <code>Deregister</code> API operation,
     *         this exception is thrown if the resource that is to be deleted or
     *         deregistered cannot be found.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you
     *         request an update to an Application Auto Scaling resource that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.PutScalingPolicy
     */
    PutScalingPolicyResult putScalingPolicy(
            PutScalingPolicyRequest putScalingPolicyRequest);

    /**
     * <p>
     * Registers or updates a scalable target. A scalable target is a resource
     * that can be scaled out or in with Application Auto Scaling. After you
     * have registered a scalable target, you can use this operation to update
     * the minimum and maximum values for your scalable dimension.
     * </p>
     * <p>
     * After you register a scalable target with Application Auto Scaling, you
     * can create and apply scaling policies to it with <a>PutScalingPolicy</a>.
     * You can view the existing scaling policies for a service namespace with
     * <a>DescribeScalableTargets</a>. If you are no longer using a scalable
     * target, you can deregister it with <a>DeregisterScalableTarget</a>.
     * </p>
     * 
     * @param registerScalableTargetRequest
     * @return Result of the RegisterScalableTarget operation returned by the
     *         service.
     * @throws ValidationException
     *         An exception was thrown for a validation issue. Review the
     *         available parameters for the API request.
     * @throws LimitExceededException
     *         Your account exceeded a limit. This exception is thrown when a
     *         per-account resource limit is exceeded. For more information, see
     *         <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_as-app"
     *         >Application Auto Scaling Limits</a>.
     * @throws ConcurrentUpdateException
     *         Concurrent updates caused an exception, for example, if you
     *         request an update to an Application Auto Scaling resource that
     *         already has a pending update.
     * @throws InternalServiceException
     *         The service encountered an internal error.
     * @sample AWSApplicationAutoScaling.RegisterScalableTarget
     */
    RegisterScalableTargetResult registerScalableTarget(
            RegisterScalableTargetRequest registerScalableTargetRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
