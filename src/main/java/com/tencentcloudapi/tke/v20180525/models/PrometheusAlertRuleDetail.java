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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusAlertRuleDetail extends AbstractModel{

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则列表
    */
    @SerializedName("Rules")
    @Expose
    private PrometheusAlertRule [] Rules;

    /**
    * 最后修改时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 告警渠道
    */
    @SerializedName("Notification")
    @Expose
    private PrometheusNotification Notification;

    /**
    * 告警 id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 如果该告警来至模板下发，则TemplateId为模板id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get 规则名称 
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则列表 
     * @return Rules 规则列表
     */
    public PrometheusAlertRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 规则列表
     * @param Rules 规则列表
     */
    public void setRules(PrometheusAlertRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 最后修改时间 
     * @return UpdatedAt 最后修改时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 最后修改时间
     * @param UpdatedAt 最后修改时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 告警渠道 
     * @return Notification 告警渠道
     */
    public PrometheusNotification getNotification() {
        return this.Notification;
    }

    /**
     * Set 告警渠道
     * @param Notification 告警渠道
     */
    public void setNotification(PrometheusNotification Notification) {
        this.Notification = Notification;
    }

    /**
     * Get 告警 id 
     * @return Id 告警 id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 告警 id
     * @param Id 告警 id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 如果该告警来至模板下发，则TemplateId为模板id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId 如果该告警来至模板下发，则TemplateId为模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 如果该告警来至模板下发，则TemplateId为模板id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId 如果该告警来至模板下发，则TemplateId为模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamObj(map, prefix + "Notification.", this.Notification);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

