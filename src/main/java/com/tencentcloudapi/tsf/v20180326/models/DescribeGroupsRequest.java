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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGroupsRequest extends AbstractModel{

    /**
    * 搜索字段
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 排序字段
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页个数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 命名空间ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 部署组资源类型列表
    */
    @SerializedName("GroupResourceTypeList")
    @Expose
    private String [] GroupResourceTypeList;

    /**
    * 部署组状态过滤字段
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 搜索字段 
     * @return SearchWord 搜索字段
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索字段
     * @param SearchWord 搜索字段
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 排序字段 
     * @return OrderBy 排序字段
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段
     * @param OrderBy 排序字段
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式 
     * @return OrderType 排序方式
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序方式
     * @param OrderType 排序方式
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页个数 
     * @return Limit 分页个数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页个数
     * @param Limit 分页个数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 命名空间ID 
     * @return NamespaceId 命名空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
     * @param NamespaceId 命名空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 部署组资源类型列表 
     * @return GroupResourceTypeList 部署组资源类型列表
     */
    public String [] getGroupResourceTypeList() {
        return this.GroupResourceTypeList;
    }

    /**
     * Set 部署组资源类型列表
     * @param GroupResourceTypeList 部署组资源类型列表
     */
    public void setGroupResourceTypeList(String [] GroupResourceTypeList) {
        this.GroupResourceTypeList = GroupResourceTypeList;
    }

    /**
     * Get 部署组状态过滤字段 
     * @return Status 部署组状态过滤字段
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 部署组状态过滤字段
     * @param Status 部署组状态过滤字段
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "GroupResourceTypeList.", this.GroupResourceTypeList);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

