package Store;

import java.util.Scanner;

public class PersonalConfiguration extends ComputerBuilder{
        Scanner in = new Scanner(System.in);
        private Computer computer;
        public PersonalConfiguration(){
            this.computer = new Computer();
        }

        @Override
        public void setRam() {
            System.out.println("Please input RAM - ");
            int inputRam = in.nextInt();
            this.computer.setRam(inputRam);
        }
        @Override
        public void setPowerSuply(){
            System.out.println("Please input PowerSuply - ");
            int inputPowerSuply = in.nextInt();
            this.computer.setPowerSuply(inputPowerSuply);
        }
        @Override
        public void setMainboard(){
            System.out.println("Please input Mainboard - ");
            String inputMainoboard = in.nextLine();
            this.computer.setMainboard(inputMainoboard);
        }
        @Override
        public void setVideocard(){
            System.out.println("Please input Videocard - ");
            String inputVideocard = in.nextLine();
            this.computer.setVideocard(inputVideocard);
        }
        @Override
        public Computer getMyComputer(){
            return this.computer;
        }



}
