package com.eslirodrigues.design_patterns.builder;

// Instead of a long parameter/attributes list: House(1, 2, null, null...) use Builder
// to construct objects step-by-step

public class House {
    private String foundation;
    private String structure;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    private House(Builder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarden = builder.hasGarden;
    }

    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", structure=" + structure +
                ", hasGarage=" + hasGarage + ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden + "]";
    }

    public static class Builder {
        private String foundation;
        private String structure;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;

        public Builder(String foundation, String structure) {
            this.foundation = foundation;
            this.structure = structure;
        }

        public Builder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public Builder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    public static void call() {
        House house = new House.Builder("Concrete", "Wood")
                .setGarage(true)
                .setGarden(true)
                .build();
        System.out.println(house);
    }
}
