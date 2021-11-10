package lab3.builder;

public class Computer
{
    private boolean bluetooth;
    private int ram;
    private int memory;
    private  String cpu;
    private String video;

    private Computer(String cpu, int ram)
    {
        this.cpu = cpu;
        this.ram = ram;
    }

    public static class Builder
    {
        private boolean bluetooth;
        private int ram;
        private int memory;
        private  String cpu;
        private String video;

        public Builder(String cpu)
        {
            this.cpu = cpu;
        }

        public void setBluetooth(boolean bluetooth)
        {
            this.bluetooth = bluetooth;
        }

        public void setRam(int ram)
        {
            this.ram = ram;
        }

        public void setMemory(int memory)
        {
            this.memory = memory;
        }

        public void setVideo(String video)
        {
            this.video = video;
        }

        public Computer build()
        {
            Computer toReturn = new Computer(this.cpu, this.ram);
            toReturn.bluetooth = this.bluetooth;
            toReturn.memory = this.memory;
            toReturn.video = this.video;

            return toReturn;
        }
    }

    @Override
    public String toString()
    {
        return "Computer with: " + this.cpu + ", ram " + this.ram + ", video " + this.video;
    }
}
