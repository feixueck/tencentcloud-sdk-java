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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ThirdPartyPublishInfo extends AbstractModel{

    /**
    * 发布通道  ID。
    */
    @SerializedName("ChannelMaterialId")
    @Expose
    private String ChannelMaterialId;

    /**
    * 企鹅号发布信息，如果使用的发布通道为企鹅号时必填。
    */
    @SerializedName("PenguinMediaPlatformPublishInfo")
    @Expose
    private PenguinMediaPlatformPublishInfo PenguinMediaPlatformPublishInfo;

    /**
    * 新浪微博发布信息，如果使用的发布通道为新浪微博时必填。
    */
    @SerializedName("WeiboPublishInfo")
    @Expose
    private WeiboPublishInfo WeiboPublishInfo;

    /**
    * 快手发布信息，如果使用的发布通道为快手时必填。
    */
    @SerializedName("KuaishouPublishInfo")
    @Expose
    private KuaishouPublishInfo KuaishouPublishInfo;

    /**
     * Get 发布通道  ID。 
     * @return ChannelMaterialId 发布通道  ID。
     */
    public String getChannelMaterialId() {
        return this.ChannelMaterialId;
    }

    /**
     * Set 发布通道  ID。
     * @param ChannelMaterialId 发布通道  ID。
     */
    public void setChannelMaterialId(String ChannelMaterialId) {
        this.ChannelMaterialId = ChannelMaterialId;
    }

    /**
     * Get 企鹅号发布信息，如果使用的发布通道为企鹅号时必填。 
     * @return PenguinMediaPlatformPublishInfo 企鹅号发布信息，如果使用的发布通道为企鹅号时必填。
     */
    public PenguinMediaPlatformPublishInfo getPenguinMediaPlatformPublishInfo() {
        return this.PenguinMediaPlatformPublishInfo;
    }

    /**
     * Set 企鹅号发布信息，如果使用的发布通道为企鹅号时必填。
     * @param PenguinMediaPlatformPublishInfo 企鹅号发布信息，如果使用的发布通道为企鹅号时必填。
     */
    public void setPenguinMediaPlatformPublishInfo(PenguinMediaPlatformPublishInfo PenguinMediaPlatformPublishInfo) {
        this.PenguinMediaPlatformPublishInfo = PenguinMediaPlatformPublishInfo;
    }

    /**
     * Get 新浪微博发布信息，如果使用的发布通道为新浪微博时必填。 
     * @return WeiboPublishInfo 新浪微博发布信息，如果使用的发布通道为新浪微博时必填。
     */
    public WeiboPublishInfo getWeiboPublishInfo() {
        return this.WeiboPublishInfo;
    }

    /**
     * Set 新浪微博发布信息，如果使用的发布通道为新浪微博时必填。
     * @param WeiboPublishInfo 新浪微博发布信息，如果使用的发布通道为新浪微博时必填。
     */
    public void setWeiboPublishInfo(WeiboPublishInfo WeiboPublishInfo) {
        this.WeiboPublishInfo = WeiboPublishInfo;
    }

    /**
     * Get 快手发布信息，如果使用的发布通道为快手时必填。 
     * @return KuaishouPublishInfo 快手发布信息，如果使用的发布通道为快手时必填。
     */
    public KuaishouPublishInfo getKuaishouPublishInfo() {
        return this.KuaishouPublishInfo;
    }

    /**
     * Set 快手发布信息，如果使用的发布通道为快手时必填。
     * @param KuaishouPublishInfo 快手发布信息，如果使用的发布通道为快手时必填。
     */
    public void setKuaishouPublishInfo(KuaishouPublishInfo KuaishouPublishInfo) {
        this.KuaishouPublishInfo = KuaishouPublishInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelMaterialId", this.ChannelMaterialId);
        this.setParamObj(map, prefix + "PenguinMediaPlatformPublishInfo.", this.PenguinMediaPlatformPublishInfo);
        this.setParamObj(map, prefix + "WeiboPublishInfo.", this.WeiboPublishInfo);
        this.setParamObj(map, prefix + "KuaishouPublishInfo.", this.KuaishouPublishInfo);

    }
}

