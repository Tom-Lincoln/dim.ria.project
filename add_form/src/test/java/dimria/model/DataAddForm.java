package dimria.model;

public class DataAddForm {

  private String city;                                // місто
  private String district = null;                     // район
  private String street;                              // вулиця
  private String metro = null;                        // станція метро
  private String residentialComplex = null;           // назва ЖК
  private String buildNum = null;                     // номер будинку
  private String roomNum = null;                      // номер квартири
  private boolean noBuildingNumber = false;           // номер будинку не присвоєно
  private boolean buildingNumDoNotShow = false;       // не показувати номер будинку
  private boolean roomNumDoNotShow = false;           // не показувати номер квартири

  private String cadastreNumber = null;               // кадастровий номер
  private boolean cadastreNumberDoNotShow = false;    // не показувати кадастровий номер

  private int countPhoto;                             // к-сть фото
  private String videoLink = null;                   // відеолінк на ютуб

  private String rooms;                               // кімнат
  private String floor;                               // поверх
  private String floors;                              // поверхів або поверховість
  private String totalArea;                           // загальна площа або площа ділянки

  private String unitLandMeasurement = null;          // площа землі null - дефолтне встановлене значення || "Hundred" || "Hectare" || "SquareMetres"

  private String carPlaces;                           // машиномісць

  private String currency;                            // валюта
  private String price;                               // ціна


  public String getCity() {
    return city;
  }

  public String getDistrict() {
    return district;
  }

  public String getStreet() {
    return street;
  }

  public String getMetro() {
    return metro;
  }

  public String getResidentialComplex() {
    return residentialComplex;
  }

  public String getBuildNum() {
    return buildNum;
  }

  public boolean getNoBuildingNumber() {
    return noBuildingNumber;
  }

  public boolean getBuildingNumDoNotShow() {
    return buildingNumDoNotShow;
  }

  public boolean getRoomNumDoNotShow() {
    return roomNumDoNotShow;
  }

  public String getRoomNum() {
    return roomNum;
  }

  public String getCadastreNumber() {
    return cadastreNumber;
  }

  public boolean getCadastreNumberDoNotShow() {
    return cadastreNumberDoNotShow;
  }

  public int getCountPhoto() {
    return countPhoto;
  }

  public String getVideoLink() {
    return videoLink;
  }

  public String getRooms() {
    return rooms;
  }

  public String getFloor() {
    return floor;
  }

  public String getFloors() {
    return floors;
  }

  public String getTotalArea() {
    return totalArea;
  }

  public String getUnitLandMeasurement() {
    return unitLandMeasurement;
  }

  public String getCarPlaces() {
    return carPlaces;
  }

  public String getCurrency() {
    return currency;
  }

  public String getPrice() {
    return price;
  }

  public DataAddForm withCity(String city) {
    this.city = city;
    return this;
  }

  public DataAddForm withDistrict(String district) {
    this.district = district;
    return this;
  }

  public DataAddForm withStreet(String street) {
    this.street = street;
    return this;
  }

  public DataAddForm withMetro(String metro) {
    this.metro = metro;
    return this;
  }

  public DataAddForm withResidentialComplex(String residentialComplex) {
    this.residentialComplex = residentialComplex;
    return this;
  }

  public DataAddForm withBuildNum(String buildNum) {
    this.buildNum = buildNum;
    return this;
  }

  public DataAddForm withNoBuildingNumber(boolean noBuildingNumber) {
    this.noBuildingNumber = noBuildingNumber;
    return this;
  }

  public DataAddForm withBuildingNumDoNotShow(boolean buildingNumDoNotShow) {
    this.buildingNumDoNotShow = buildingNumDoNotShow;
    return this;
  }

  public DataAddForm withRoomNumDoNotShow(boolean roomNumDoNotShow) {
    this.roomNumDoNotShow = roomNumDoNotShow;
    return this;
  }

  public DataAddForm withRoomNum(String roomNum) {
    this.roomNum = roomNum;
    return this;
  }

  public DataAddForm withCadastreNumber(String cadastre) {
    this.cadastreNumber = cadastre;
    return this;
  }

  public DataAddForm withCadastreNumberDoNotShow(boolean cadastreNumberDoNotShow) {
    this.cadastreNumberDoNotShow = cadastreNumberDoNotShow;
    return this;
  }

  public DataAddForm withCountPhoto(int countPhoto) {
    this.countPhoto = countPhoto;
    return this;
  }

  public DataAddForm withVideoLink(String videoLink) {
    this.videoLink = videoLink;
    return this;
  }

  public DataAddForm withRooms(String rooms) {
    this.rooms = rooms;
    return this;
  }

  public DataAddForm withFloor(String floor) {
    this.floor = floor;
    return this;
  }

  public DataAddForm withFloors(String floors) {
    this.floors = floors;
    return this;
  }

  public DataAddForm withTotalArea(String totalArea) {
    this.totalArea = totalArea;
    return this;
  }

  public DataAddForm withUnitLandMeasurement(String unitLandMeasurement) {
    this.unitLandMeasurement = unitLandMeasurement;
    return this;
  }

  public DataAddForm withCarPlaces(String carPlaces) {
    this.carPlaces = carPlaces;
    return this;
  }

  public DataAddForm withCurrency(String currency) {
    this.currency = currency;
    return this;
  }

  public DataAddForm withPrice(String price) {
    this.price = price;
    return this;
  }

}
