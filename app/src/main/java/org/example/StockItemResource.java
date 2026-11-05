package org.example;

// Resource Mapping
record StockItemResource(String registration, String make, String model, boolean scrapped, boolean stolen,
                         boolean exported) {

    public static StockItemResource toResource(StockItem domain) {
        return new StockItemResource(domain.getRegistration(), domain.getModel(), domain.getModel(), domain.isStolen(), domain.isStolen(), domain.isExported());
    }

    public static StockItem toDomain(StockItemResource resource) {
        StockItem domain = new StockItem();
        domain.setRegistration(resource.registration());
        domain.setMake(resource.make());
        domain.setModel(resource.model());
        domain.setStolen(resource.stolen());
        domain.setScrapped(resource.scrapped());
        return domain;
    }
}
