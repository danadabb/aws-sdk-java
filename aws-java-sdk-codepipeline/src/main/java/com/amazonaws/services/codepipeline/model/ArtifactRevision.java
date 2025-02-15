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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Represents revision details of an artifact.
 * </p>
 */
public class ArtifactRevision implements Serializable, Cloneable {

    /**
     * <p>
     * The revision ID of the artifact.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * An additional identifier for a revision, such as a commit date or, for
     * artifacts stored in Amazon S3 buckets, the ETag value.
     * </p>
     */
    private String revisionChangeIdentifier;
    /**
     * <p>
     * Summary information about the most recent revision of the artifact. For
     * GitHub and AWS CodeCommit repositories, the commit message. For Amazon S3
     * buckets or actions, the user-provided value of an
     * <code>x-amz-meta-codepipeline-artifact-revision-summary</code> key
     * specified in the object metadata.
     * </p>
     */
    private String revisionSummary;
    /**
     * <p>
     * The date and time when the most recent revision of the artifact was
     * created, in timestamp format.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The commit ID for the artifact revision. For artifacts stored in GitHub
     * or AWS CodeCommit repositories, the commit ID is linked to a commit
     * details page.
     * </p>
     */
    private String revisionUrl;

    /**
     * <p>
     * The revision ID of the artifact.
     * </p>
     * 
     * @param revisionId
     *        The revision ID of the artifact.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The revision ID of the artifact.
     * </p>
     * 
     * @return The revision ID of the artifact.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The revision ID of the artifact.
     * </p>
     * 
     * @param revisionId
     *        The revision ID of the artifact.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ArtifactRevision withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * An additional identifier for a revision, such as a commit date or, for
     * artifacts stored in Amazon S3 buckets, the ETag value.
     * </p>
     * 
     * @param revisionChangeIdentifier
     *        An additional identifier for a revision, such as a commit date or,
     *        for artifacts stored in Amazon S3 buckets, the ETag value.
     */

    public void setRevisionChangeIdentifier(String revisionChangeIdentifier) {
        this.revisionChangeIdentifier = revisionChangeIdentifier;
    }

    /**
     * <p>
     * An additional identifier for a revision, such as a commit date or, for
     * artifacts stored in Amazon S3 buckets, the ETag value.
     * </p>
     * 
     * @return An additional identifier for a revision, such as a commit date
     *         or, for artifacts stored in Amazon S3 buckets, the ETag value.
     */

    public String getRevisionChangeIdentifier() {
        return this.revisionChangeIdentifier;
    }

    /**
     * <p>
     * An additional identifier for a revision, such as a commit date or, for
     * artifacts stored in Amazon S3 buckets, the ETag value.
     * </p>
     * 
     * @param revisionChangeIdentifier
     *        An additional identifier for a revision, such as a commit date or,
     *        for artifacts stored in Amazon S3 buckets, the ETag value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ArtifactRevision withRevisionChangeIdentifier(
            String revisionChangeIdentifier) {
        setRevisionChangeIdentifier(revisionChangeIdentifier);
        return this;
    }

    /**
     * <p>
     * Summary information about the most recent revision of the artifact. For
     * GitHub and AWS CodeCommit repositories, the commit message. For Amazon S3
     * buckets or actions, the user-provided value of an
     * <code>x-amz-meta-codepipeline-artifact-revision-summary</code> key
     * specified in the object metadata.
     * </p>
     * 
     * @param revisionSummary
     *        Summary information about the most recent revision of the
     *        artifact. For GitHub and AWS CodeCommit repositories, the commit
     *        message. For Amazon S3 buckets or actions, the user-provided value
     *        of an
     *        <code>x-amz-meta-codepipeline-artifact-revision-summary</code> key
     *        specified in the object metadata.
     */

    public void setRevisionSummary(String revisionSummary) {
        this.revisionSummary = revisionSummary;
    }

    /**
     * <p>
     * Summary information about the most recent revision of the artifact. For
     * GitHub and AWS CodeCommit repositories, the commit message. For Amazon S3
     * buckets or actions, the user-provided value of an
     * <code>x-amz-meta-codepipeline-artifact-revision-summary</code> key
     * specified in the object metadata.
     * </p>
     * 
     * @return Summary information about the most recent revision of the
     *         artifact. For GitHub and AWS CodeCommit repositories, the commit
     *         message. For Amazon S3 buckets or actions, the user-provided
     *         value of an
     *         <code>x-amz-meta-codepipeline-artifact-revision-summary</code>
     *         key specified in the object metadata.
     */

    public String getRevisionSummary() {
        return this.revisionSummary;
    }

    /**
     * <p>
     * Summary information about the most recent revision of the artifact. For
     * GitHub and AWS CodeCommit repositories, the commit message. For Amazon S3
     * buckets or actions, the user-provided value of an
     * <code>x-amz-meta-codepipeline-artifact-revision-summary</code> key
     * specified in the object metadata.
     * </p>
     * 
     * @param revisionSummary
     *        Summary information about the most recent revision of the
     *        artifact. For GitHub and AWS CodeCommit repositories, the commit
     *        message. For Amazon S3 buckets or actions, the user-provided value
     *        of an
     *        <code>x-amz-meta-codepipeline-artifact-revision-summary</code> key
     *        specified in the object metadata.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ArtifactRevision withRevisionSummary(String revisionSummary) {
        setRevisionSummary(revisionSummary);
        return this;
    }

    /**
     * <p>
     * The date and time when the most recent revision of the artifact was
     * created, in timestamp format.
     * </p>
     * 
     * @param created
     *        The date and time when the most recent revision of the artifact
     *        was created, in timestamp format.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date and time when the most recent revision of the artifact was
     * created, in timestamp format.
     * </p>
     * 
     * @return The date and time when the most recent revision of the artifact
     *         was created, in timestamp format.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The date and time when the most recent revision of the artifact was
     * created, in timestamp format.
     * </p>
     * 
     * @param created
     *        The date and time when the most recent revision of the artifact
     *        was created, in timestamp format.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ArtifactRevision withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The commit ID for the artifact revision. For artifacts stored in GitHub
     * or AWS CodeCommit repositories, the commit ID is linked to a commit
     * details page.
     * </p>
     * 
     * @param revisionUrl
     *        The commit ID for the artifact revision. For artifacts stored in
     *        GitHub or AWS CodeCommit repositories, the commit ID is linked to
     *        a commit details page.
     */

    public void setRevisionUrl(String revisionUrl) {
        this.revisionUrl = revisionUrl;
    }

    /**
     * <p>
     * The commit ID for the artifact revision. For artifacts stored in GitHub
     * or AWS CodeCommit repositories, the commit ID is linked to a commit
     * details page.
     * </p>
     * 
     * @return The commit ID for the artifact revision. For artifacts stored in
     *         GitHub or AWS CodeCommit repositories, the commit ID is linked to
     *         a commit details page.
     */

    public String getRevisionUrl() {
        return this.revisionUrl;
    }

    /**
     * <p>
     * The commit ID for the artifact revision. For artifacts stored in GitHub
     * or AWS CodeCommit repositories, the commit ID is linked to a commit
     * details page.
     * </p>
     * 
     * @param revisionUrl
     *        The commit ID for the artifact revision. For artifacts stored in
     *        GitHub or AWS CodeCommit repositories, the commit ID is linked to
     *        a commit details page.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ArtifactRevision withRevisionUrl(String revisionUrl) {
        setRevisionUrl(revisionUrl);
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
        if (getRevisionId() != null)
            sb.append("RevisionId: " + getRevisionId() + ",");
        if (getRevisionChangeIdentifier() != null)
            sb.append("RevisionChangeIdentifier: "
                    + getRevisionChangeIdentifier() + ",");
        if (getRevisionSummary() != null)
            sb.append("RevisionSummary: " + getRevisionSummary() + ",");
        if (getCreated() != null)
            sb.append("Created: " + getCreated() + ",");
        if (getRevisionUrl() != null)
            sb.append("RevisionUrl: " + getRevisionUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArtifactRevision == false)
            return false;
        ArtifactRevision other = (ArtifactRevision) obj;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null
                && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getRevisionChangeIdentifier() == null
                ^ this.getRevisionChangeIdentifier() == null)
            return false;
        if (other.getRevisionChangeIdentifier() != null
                && other.getRevisionChangeIdentifier().equals(
                        this.getRevisionChangeIdentifier()) == false)
            return false;
        if (other.getRevisionSummary() == null
                ^ this.getRevisionSummary() == null)
            return false;
        if (other.getRevisionSummary() != null
                && other.getRevisionSummary().equals(this.getRevisionSummary()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null
                && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getRevisionUrl() == null ^ this.getRevisionUrl() == null)
            return false;
        if (other.getRevisionUrl() != null
                && other.getRevisionUrl().equals(this.getRevisionUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime
                * hashCode
                + ((getRevisionChangeIdentifier() == null) ? 0
                        : getRevisionChangeIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getRevisionSummary() == null) ? 0 : getRevisionSummary()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime
                * hashCode
                + ((getRevisionUrl() == null) ? 0 : getRevisionUrl().hashCode());
        return hashCode;
    }

    @Override
    public ArtifactRevision clone() {
        try {
            return (ArtifactRevision) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
