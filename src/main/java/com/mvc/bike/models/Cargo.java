package com.mvc.bike.models;

public class Cargo {
    private Long id;
	private Integer length;
    private Integer width;
    private Integer weight;
    private String cargoType;
    private String storageType;
    private static String DRY_STORAGE;
    private static String COLD_STORAGE;



    public Cargo(String s){
        String[] detail=new String[6];
        detail=s.split(",");
        this.id=Long.parseLong(detail[0]);
        this.length=Integer.parseInt(detail[1]);
        this.width=Integer.parseInt(detail[2]);
        this.weight=Integer.parseInt(detail[3]);
        this.cargoType=detail[4];
        this.storageType=detail[5];
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public static String getDryStorage() {
        return DRY_STORAGE;
    }

    public static void setDryStorage(String dryStorage) {
        DRY_STORAGE = dryStorage;
    }

    public static String getColdStorage() {
        return COLD_STORAGE;
    }

    public static void setColdStorage(String coldStorage) {
        COLD_STORAGE = coldStorage;
    }



}
