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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSuperPlayerConfigsRequest extends AbstractModel{

    /**
    * 播放器配置名字过滤条件，数组长度限制：100。
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * 分页偏移量，默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数，默认值：10，最大值：100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 播放器配置类型过滤条件，可选值：
<li>Preset：系统预置配置；</li>
<li>Custom：用户自定义配置。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 播放器配置名字过滤条件，数组长度限制：100。 
     * @return Names 播放器配置名字过滤条件，数组长度限制：100。
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 播放器配置名字过滤条件，数组长度限制：100。
     * @param Names 播放器配置名字过滤条件，数组长度限制：100。
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get 分页偏移量，默认值：0。 
     * @return Offset 分页偏移量，默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认值：0。
     * @param Offset 分页偏移量，默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回记录条数，默认值：10，最大值：100。 
     * @return Limit 返回记录条数，默认值：10，最大值：100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数，默认值：10，最大值：100。
     * @param Limit 返回记录条数，默认值：10，最大值：100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 播放器配置类型过滤条件，可选值：
<li>Preset：系统预置配置；</li>
<li>Custom：用户自定义配置。</li> 
     * @return Type 播放器配置类型过滤条件，可选值：
<li>Preset：系统预置配置；</li>
<li>Custom：用户自定义配置。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 播放器配置类型过滤条件，可选值：
<li>Preset：系统预置配置；</li>
<li>Custom：用户自定义配置。</li>
     * @param Type 播放器配置类型过滤条件，可选值：
<li>Preset：系统预置配置；</li>
<li>Custom：用户自定义配置。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

