package jhotel;

public class RoomSudahAdaException extends Exception {
    private Room room_error;

    public RoomSudahAdaException (Room room_input){
        super("Kamar dengan nomor ruang ");
        room_error=room_input;
    }

    public String getPesan(){
        return (super.getMessage() + room_error.getNomorKamar() + " pada\n" + room_error.getHotel() + "sudah terdaftar.");
    }
}
