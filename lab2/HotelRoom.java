// Implements a HotelRoom class
public class HotelRoom
{
    // 1
    // stores room number as int
    private int roomNumber;
    // stores room type as "Single" or "Double"
    private String roomType;

    // 2
    // stores whether occupied, 0 empty, 1 occupied
    private int occupied;
    // stores nightly rate
    private double rate;

    public HotelRoom()
    {
        
    }

    // 3
    public HotelRoom(int roomNum, String type, int taken, double rateNum)
    {
        setRoomNumber(roomNum);
        setRoomType(type);
        setOccupied(taken);
        setRate(rateNum);
    }

    // 4
    public boolean isOccupied()
    {
        return occupied == 1;
    }

    // 1
    public void setRoomNumber(int roomNum)
    {
        roomNumber = roomNum;
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }
    public void setRoomType(String type)
    {
        roomType = type;
    }

    public String getRoomType()
    {
        return roomType;
    }

    // 2
    public void setOccupied(int taken)
    {
        occupied = taken;
    }

    public int getOccupied()
    {
        return occupied;
    }

    public void setRate(double rateNum)
    {
        rate = rateNum;
    }

    public double getRate()
    {
        return rate;
    }

    public String toString()
    {
        return "Room number: " + String.valueOf(getRoomNumber()) + ", Room type: " + getRoomType() + ", Occupied: " + String.valueOf(getOccupied()) + ", Nightly rate: " + String.valueOf(getRate());
    }
}