/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="WordsOptions.java">
 *   Copyright (c) 2003-2018 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.viewer.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The Text documents rendering options.
 */
@ApiModel(description = "The Text documents rendering options.")
public class WordsOptions {
  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("renderTrackedChanges")
  private Boolean renderTrackedChanges = null;

  public WordsOptions encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * The document encoding e.g. \&quot;utf-8\&quot;.
   * @return encoding
  **/
  @ApiModelProperty(value = "The document encoding e.g. \"utf-8\".")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public WordsOptions renderTrackedChanges(Boolean renderTrackedChanges) {
    this.renderTrackedChanges = renderTrackedChanges;
    return this;
  }

   /**
   * Indicates whether Tracked Changes (Revisions) should be rendered or not.
   * @return renderTrackedChanges
  **/
  @ApiModelProperty(value = "Indicates whether Tracked Changes (Revisions) should be rendered or not.")
  public Boolean isisRenderTrackedChanges() {
    return renderTrackedChanges;
  }

  public void setRenderTrackedChanges(Boolean renderTrackedChanges) {
    this.renderTrackedChanges = renderTrackedChanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WordsOptions wordsOptions = (WordsOptions) o;
    return Objects.equals(this.encoding, wordsOptions.encoding) &&
        Objects.equals(this.renderTrackedChanges, wordsOptions.renderTrackedChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoding, renderTrackedChanges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordsOptions {\n");
    
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    renderTrackedChanges: ").append(toIndentedString(renderTrackedChanges)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

