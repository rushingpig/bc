package com.wasai.bc.domain;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.google.common.base.Objects;

public class Version {
    private Integer id;

    private String type;

    private Integer ver;

    private String verString;

    private String osRequire;

    private String logo;

    private String url;

    private String description;

    private String status;

    private Long lastModifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @NotNull(message="type不能为空")
    @Length(min=10,max=12)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getVer() {
        return ver;
    }

    public void setVer(Integer ver) {
        this.ver = ver;
    }

    public String getVerString() {
        return verString;
    }

    public void setVerString(String verString) {
        this.verString = verString == null ? null : verString.trim();
    }

    public String getOsRequire() {
        return osRequire;
    }

    public void setOsRequire(String osRequire) {
        this.osRequire = osRequire == null ? null : osRequire.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Long getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Long lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
    
    @SuppressWarnings("deprecation")
	@Override
    public String toString() {
    	return Objects.toStringHelper(getClass()).add("type", type).add("description", description).toString();
    }
    
    public static void main(String[] args) {
		Version v = new Version();
		System.out.println(v.toString());
	}
}