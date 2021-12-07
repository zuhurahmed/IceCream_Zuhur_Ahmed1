package be.intecbrussel.seller;

public class Stock {

        private int iceRockets;
        private int cones;
        private int balls ;
        private int magni;

        //Constructor
        public Stock(int iceRockets, int cones, int balls, int magni) {
            this.iceRockets = iceRockets;
            this.cones = cones;
            this.balls = balls;
            this.magni = magni;
        }

//Getters
        public int getIceRockets() {
            return iceRockets;
        }
  //Setters
        public void setIceRockets(int iceRockets) {
            this.iceRockets = iceRockets;
        }
        public int getCones() {
            return cones;
        }
        public void setCones(int cones) {
            this.cones = cones;
        }
        public int getBalls() {
            return balls;
        }
        public void setBalls(int balls) {
            this.balls = balls;
        }
        public int getMagni() {
            return magni;
        }
        //void
        public void setMagni(int magni) {
            this.magni=magni;
        }

    @Override
    public String toString() {
        return super.toString( );
    }
}

