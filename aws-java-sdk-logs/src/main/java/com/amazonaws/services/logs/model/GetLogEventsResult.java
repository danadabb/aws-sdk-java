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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * 
 */
public class GetLogEventsResult implements Serializable, Cloneable {

    private com.amazonaws.internal.SdkInternalList<OutputLogEvent> events;

    private String nextForwardToken;

    private String nextBackwardToken;

    /**
     * @return
     */

    public java.util.List<OutputLogEvent> getEvents() {
        if (events == null) {
            events = new com.amazonaws.internal.SdkInternalList<OutputLogEvent>();
        }
        return events;
    }

    /**
     * @param events
     */

    public void setEvents(java.util.Collection<OutputLogEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new com.amazonaws.internal.SdkInternalList<OutputLogEvent>(
                events);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEvents(java.util.Collection)} or
     * {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetLogEventsResult withEvents(OutputLogEvent... events) {
        if (this.events == null) {
            setEvents(new com.amazonaws.internal.SdkInternalList<OutputLogEvent>(
                    events.length));
        }
        for (OutputLogEvent ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * @param events
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetLogEventsResult withEvents(
            java.util.Collection<OutputLogEvent> events) {
        setEvents(events);
        return this;
    }

    /**
     * @param nextForwardToken
     */

    public void setNextForwardToken(String nextForwardToken) {
        this.nextForwardToken = nextForwardToken;
    }

    /**
     * @return
     */

    public String getNextForwardToken() {
        return this.nextForwardToken;
    }

    /**
     * @param nextForwardToken
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetLogEventsResult withNextForwardToken(String nextForwardToken) {
        setNextForwardToken(nextForwardToken);
        return this;
    }

    /**
     * @param nextBackwardToken
     */

    public void setNextBackwardToken(String nextBackwardToken) {
        this.nextBackwardToken = nextBackwardToken;
    }

    /**
     * @return
     */

    public String getNextBackwardToken() {
        return this.nextBackwardToken;
    }

    /**
     * @param nextBackwardToken
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetLogEventsResult withNextBackwardToken(String nextBackwardToken) {
        setNextBackwardToken(nextBackwardToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEvents() != null)
            sb.append("Events: " + getEvents() + ",");
        if (getNextForwardToken() != null)
            sb.append("NextForwardToken: " + getNextForwardToken() + ",");
        if (getNextBackwardToken() != null)
            sb.append("NextBackwardToken: " + getNextBackwardToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLogEventsResult == false)
            return false;
        GetLogEventsResult other = (GetLogEventsResult) obj;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null
                && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getNextForwardToken() == null
                ^ this.getNextForwardToken() == null)
            return false;
        if (other.getNextForwardToken() != null
                && other.getNextForwardToken().equals(
                        this.getNextForwardToken()) == false)
            return false;
        if (other.getNextBackwardToken() == null
                ^ this.getNextBackwardToken() == null)
            return false;
        if (other.getNextBackwardToken() != null
                && other.getNextBackwardToken().equals(
                        this.getNextBackwardToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime
                * hashCode
                + ((getNextForwardToken() == null) ? 0 : getNextForwardToken()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNextBackwardToken() == null) ? 0
                        : getNextBackwardToken().hashCode());
        return hashCode;
    }

    @Override
    public GetLogEventsResult clone() {
        try {
            return (GetLogEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
