package com.vikram.designpatterns.builder;

public class Computer {
    private final String processor;
    private final int memoryGb;
    private final int storageGb;

    private Computer(Builder builder) {
        this.processor = builder.processor;
        this.memoryGb = builder.memoryGb;
        this.storageGb = builder.storageGb;
    }

    @Override
    public String toString() {
        return processor + ", " + memoryGb + "GB RAM, " + storageGb + "GB SSD";
    }

    public static class Builder {
        private String processor;
        private int memoryGb;
        private int storageGb;

        public Builder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder memoryGb(int memoryGb) {
            this.memoryGb = memoryGb;
            return this;
        }

        public Builder storageGb(int storageGb) {
            this.storageGb = storageGb;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
