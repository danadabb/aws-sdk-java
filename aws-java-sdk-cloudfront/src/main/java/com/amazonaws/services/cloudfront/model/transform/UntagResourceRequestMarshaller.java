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
package com.amazonaws.services.cloudfront.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.XMLWriter;
import com.amazonaws.util.SdkHttpUtils;

/**
 * UntagResourceRequest Marshaller
 */

public class UntagResourceRequestMarshaller implements
        Marshaller<Request<UntagResourceRequest>, UntagResourceRequest> {

    public Request<UntagResourceRequest> marshall(
            UntagResourceRequest untagResourceRequest) {

        if (untagResourceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UntagResourceRequest> request = new DefaultRequest<UntagResourceRequest>(
                untagResourceRequest, "AmazonCloudFront");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2016-08-20/tagging?Operation=Untag";

        uriResourcePath = com.amazonaws.util.UriResourcePathUtils
                .addStaticQueryParamtersToRequest(request, uriResourcePath);

        request.setResourcePath(uriResourcePath);

        if (untagResourceRequest.getResource() != null) {
            request.addParameter("Resource",
                    StringUtils.fromString(untagResourceRequest.getResource()));
        }

        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter,
                    "http://cloudfront.amazonaws.com/doc/2016-08-20/");

            TagKeys tagKeys = untagResourceRequest.getTagKeys();
            if (tagKeys != null) {
                xmlWriter.startElement("TagKeys");

                com.amazonaws.internal.SdkInternalList<String> tagKeysItemsList = (com.amazonaws.internal.SdkInternalList<String>) tagKeys
                        .getItems();
                if (!tagKeysItemsList.isEmpty()
                        || !tagKeysItemsList.isAutoConstruct()) {
                    xmlWriter.startElement("Items");

                    for (String tagKeysItemsListValue : tagKeysItemsList) {
                        xmlWriter.startElement("Key");
                        xmlWriter.value(tagKeysItemsListValue);
                        xmlWriter.endElement();
                    }
                    xmlWriter.endElement();
                }
                xmlWriter.endElement();
            }

            request.setContent(new StringInputStream(stringWriter.getBuffer()
                    .toString()));
            request.addHeader(
                    "Content-Length",
                    Integer.toString(stringWriter.getBuffer().toString()
                            .getBytes(UTF8).length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", "application/xml");
            }
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to XML: " + t.getMessage(), t);
        }

        return request;
    }

}
