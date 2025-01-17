package com.infi.overwatch.overwatchandroid.model.Video;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Preview {

    @SerializedName("small")
    @Expose
    private String small;
    @SerializedName("medium")
    @Expose
    private String medium;
    @SerializedName("large")
    @Expose
    private String large;
    @SerializedName("template")
    @Expose
    private String template;

    /**
     *
     * @return
     * The small
     */
    public String getSmall() {
        return small;
    }

    /**
     *
     * @param small
     * The small
     */
    public void setSmall(String small) {
        this.small = small;
    }

    /**
     *
     * @return
     * The medium
     */
    public String getMedium() {
        return medium;
    }

    /**
     *
     * @param medium
     * The medium
     */
    public void setMedium(String medium) {
        this.medium = medium;
    }

    /**
     *
     * @return
     * The large
     */
    public String getLarge() {
        return large;
    }

    /**
     *
     * @param large
     * The large
     */
    public void setLarge(String large) {
        this.large = large;
    }

    /**
     *
     * @return
     * The template
     */
    public String getTemplate() {
        return template;
    }

    /**
     *
     * @param template
     * The template
     */
    public void setTemplate(String template) {
        this.template = template;
    }

}
