package com.sgc.mybatisG.model;

public class TblDictionaries {
    /**
     * null
     */
    private Long id;

    /**
     * null
     */
    private String dimensions;

    /**
     * null
     */
    private String name;

    /**
     * null
     */
    private Integer type;

    /**
     * null
     */
    private Integer mold;

    /**
     * null
     * @return id null
     */
    public Long getId() {
        return id;
    }

    /**
     * null
     * @param id null
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * null
     * @return dimensions null
     */
    public String getDimensions() {
        return dimensions;
    }

    /**
     * null
     * @param dimensions null
     */
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions == null ? null : dimensions.trim();
    }

    /**
     * null
     * @return name null
     */
    public String getName() {
        return name;
    }

    /**
     * null
     * @param name null
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * null
     * @return type null
     */
    public Integer getType() {
        return type;
    }

    /**
     * null
     * @param type null
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * null
     * @return mold null
     */
    public Integer getMold() {
        return mold;
    }

    /**
     * null
     * @param mold null
     */
    public void setMold(Integer mold) {
        this.mold = mold;
    }
}