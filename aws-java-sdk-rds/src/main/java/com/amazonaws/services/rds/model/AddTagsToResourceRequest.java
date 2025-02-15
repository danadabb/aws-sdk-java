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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class AddTagsToResourceRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The Amazon RDS resource the tags will be added to. This value is an
     * Amazon Resource Name (ARN). For information about creating an ARN, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an RDS Amazon Resource Name (ARN)</a>.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The tags to be assigned to the Amazon RDS resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The Amazon RDS resource the tags will be added to. This value is an
     * Amazon Resource Name (ARN). For information about creating an ARN, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an RDS Amazon Resource Name (ARN)</a>.
     * </p>
     * 
     * @param resourceName
     *        The Amazon RDS resource the tags will be added to. This value is
     *        an Amazon Resource Name (ARN). For information about creating an
     *        ARN, see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *        > Constructing an RDS Amazon Resource Name (ARN)</a>.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The Amazon RDS resource the tags will be added to. This value is an
     * Amazon Resource Name (ARN). For information about creating an ARN, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an RDS Amazon Resource Name (ARN)</a>.
     * </p>
     * 
     * @return The Amazon RDS resource the tags will be added to. This value is
     *         an Amazon Resource Name (ARN). For information about creating an
     *         ARN, see <a href=
     *         "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *         > Constructing an RDS Amazon Resource Name (ARN)</a>.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The Amazon RDS resource the tags will be added to. This value is an
     * Amazon Resource Name (ARN). For information about creating an ARN, see <a
     * href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an RDS Amazon Resource Name (ARN)</a>.
     * </p>
     * 
     * @param resourceName
     *        The Amazon RDS resource the tags will be added to. This value is
     *        an Amazon Resource Name (ARN). For information about creating an
     *        ARN, see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *        > Constructing an RDS Amazon Resource Name (ARN)</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AddTagsToResourceRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the Amazon RDS resource.
     * </p>
     * 
     * @return The tags to be assigned to the Amazon RDS resource.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags to be assigned to the Amazon RDS resource.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the Amazon RDS resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to be assigned to the Amazon RDS resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or
     * {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the Amazon RDS resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AddTagsToResourceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the Amazon RDS resource.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the Amazon RDS resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AddTagsToResourceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getResourceName() != null)
            sb.append("ResourceName: " + getResourceName() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddTagsToResourceRequest == false)
            return false;
        AddTagsToResourceRequest other = (AddTagsToResourceRequest) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null
                && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null
                && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceName() == null) ? 0 : getResourceName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AddTagsToResourceRequest clone() {
        return (AddTagsToResourceRequest) super.clone();
    }
}
