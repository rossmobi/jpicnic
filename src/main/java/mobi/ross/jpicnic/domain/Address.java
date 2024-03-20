package mobi.ross.jpicnic.domain;

public record Address(
    int houseNumber,
    int houseNumberExt,
    String postcode,
    String street,
    String city) {}