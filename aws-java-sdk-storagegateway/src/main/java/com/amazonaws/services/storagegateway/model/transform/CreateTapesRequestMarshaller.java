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
package com.amazonaws.services.storagegateway.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * CreateTapesRequest Marshaller
 */
public class CreateTapesRequestMarshaller implements
        Marshaller<Request<CreateTapesRequest>, CreateTapesRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public CreateTapesRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateTapesRequest> marshall(
            CreateTapesRequest createTapesRequest) {

        if (createTapesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateTapesRequest> request = new DefaultRequest<CreateTapesRequest>(
                createTapesRequest, "AWSStorageGateway");
        request.addHeader("X-Amz-Target", "StorageGateway_20130630.CreateTapes");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory
                    .createGenerator();

            jsonGenerator.writeStartObject();

            if (createTapesRequest.getGatewayARN() != null) {
                jsonGenerator.writeFieldName("GatewayARN").writeValue(
                        createTapesRequest.getGatewayARN());
            }
            if (createTapesRequest.getTapeSizeInBytes() != null) {
                jsonGenerator.writeFieldName("TapeSizeInBytes").writeValue(
                        createTapesRequest.getTapeSizeInBytes());
            }
            if (createTapesRequest.getClientToken() != null) {
                jsonGenerator.writeFieldName("ClientToken").writeValue(
                        createTapesRequest.getClientToken());
            }
            if (createTapesRequest.getNumTapesToCreate() != null) {
                jsonGenerator.writeFieldName("NumTapesToCreate").writeValue(
                        createTapesRequest.getNumTapesToCreate());
            }
            if (createTapesRequest.getTapeBarcodePrefix() != null) {
                jsonGenerator.writeFieldName("TapeBarcodePrefix").writeValue(
                        createTapesRequest.getTapeBarcodePrefix());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
