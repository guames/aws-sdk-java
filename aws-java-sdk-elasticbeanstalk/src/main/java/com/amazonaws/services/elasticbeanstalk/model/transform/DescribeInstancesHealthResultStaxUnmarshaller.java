/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeInstancesHealthResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstancesHealthResultStaxUnmarshaller implements Unmarshaller<DescribeInstancesHealthResult, StaxUnmarshallerContext> {

    public DescribeInstancesHealthResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeInstancesHealthResult describeInstancesHealthResult = new DescribeInstancesHealthResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeInstancesHealthResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("InstanceHealthList", targetDepth)) {
                    describeInstancesHealthResult.withInstanceHealthList(new ArrayList<SingleInstanceHealth>());
                    continue;
                }

                if (context.testExpression("InstanceHealthList/member", targetDepth)) {
                    describeInstancesHealthResult.withInstanceHealthList(SingleInstanceHealthStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RefreshedAt", targetDepth)) {
                    describeInstancesHealthResult.setRefreshedAt(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("NextToken", targetDepth)) {
                    describeInstancesHealthResult.setNextToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeInstancesHealthResult;
                }
            }
        }
    }

    private static DescribeInstancesHealthResultStaxUnmarshaller instance;

    public static DescribeInstancesHealthResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeInstancesHealthResultStaxUnmarshaller();
        return instance;
    }
}
