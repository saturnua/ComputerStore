package Store;

import java.util.Scanner;

public final class PersonalConfiguration extends ComputerBuilder{


        @Override
        public ComputerBuilder powerSupply(int power){
            setPowerSupply(power);
            return this;
        }
        @Override
        public ComputerBuilder ram(int myRam){
            setRam(myRam);
            return this;
        }
        @Override
        public ComputerBuilder mainboard(String myMainboard){
            setMainboard(myMainboard);
            return this;
        }
        @Override
        public ComputerBuilder videocard(String myVideocard){
            setVideocard(myVideocard);
            return this;
        }

        Scanner in = new Scanner(System.in);


        @Override
        public Computer build(){
            //check exceptions or set standard fields
                if (getPowerSupply() == 0){
                    setPowerSupply(600);
                }
                if(getRam()== 0){
                    setRam(1024);
                }
                if(getMainboard()== null){
                    setMainboard("DefaultMainboard");
                }
                if (getVideocard()==null){
                    setVideocard("DefaultVideocard");
                }
            return new Computer(this);

        }
        @Override
        public int getPowerSupply() {
            return powerSupply;
        }
        @Override
        public void setPowerSupply(int powerSupply){
            System.out.println("Please input PowerSuply - ");
            int inputPowerSuply = in.nextInt();
            this.powerSupply(inputPowerSuply);
        }
        @Override
        public int getRam() {
            return ram;
        }
        @Override
        public void setRam(int ram) {
            System.out.println("Please input RAM - ");
            int inputRam = in.nextInt();
            this.ram(inputRam);
        }
        @Override
        public String getMainboard() {
            return mainboard;
        }
        @Override
        public void setMainboard(String mainboard){
            System.out.println("Please input Mainboard - ");
            String inputMainoboard = in.nextLine();
            this.mainboard(inputMainoboard);
        }
        @Override
        public String getVideocard() {
            return videocard;
        }
        @Override
        public void setVideocard(String videocard){
            System.out.println("Please input Videocard - ");
            String inputVideocard = in.nextLine();
            this.videocard(inputVideocard);
        }


}
