public class MidRangeDeviceFactory extends ElectronicDeviceAbstractFactory {
    @Override
    Phone getPhone() {
        return new MidRangPhone();
    }

    @Override
    LapTop getLabTop() {
        return new MidRangeLapTop();
    }
}
