/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListBlackEmailAddressRequest extends AbstractModel{

    /**
    * 开始日期
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 结束日期
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 规范，配合Offset使用
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 规范，配合Limit使用
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 可以指定邮箱进行查询
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
    * 可以指定任务ID进行查询
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
     * Get 开始日期 
     * @return StartDate 开始日期
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 开始日期
     * @param StartDate 开始日期
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 结束日期 
     * @return EndDate 结束日期
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 结束日期
     * @param EndDate 结束日期
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 规范，配合Offset使用 
     * @return Limit 规范，配合Offset使用
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 规范，配合Offset使用
     * @param Limit 规范，配合Offset使用
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 规范，配合Limit使用 
     * @return Offset 规范，配合Limit使用
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 规范，配合Limit使用
     * @param Offset 规范，配合Limit使用
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 可以指定邮箱进行查询 
     * @return EmailAddress 可以指定邮箱进行查询
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set 可以指定邮箱进行查询
     * @param EmailAddress 可以指定邮箱进行查询
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    /**
     * Get 可以指定任务ID进行查询 
     * @return TaskID 可以指定任务ID进行查询
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 可以指定任务ID进行查询
     * @param TaskID 可以指定任务ID进行查询
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);

    }
}

