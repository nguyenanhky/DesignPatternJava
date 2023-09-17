public class HighEndDeviceFactory  extends ElectronicDeviceAbstractFactory{
    @Override
    Phone getPhone() {
       return new HighEndPhone();
    }

    @Override
    LapTop getLabTop() {
        return new HighEndLapTop();
    }
}
