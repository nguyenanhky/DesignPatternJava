public class ClientTest {
    public static void main(String[] args) {
        ElectronicDeviceAbstractFactory highEndFactory = ElectronicDeviceFactory.getFactory(Segment.HIGH_END);
        LapTop highEndLapTop = highEndFactory.getLabTop();
        Phone highEndPhone = highEndFactory.getPhone();
        System.out.println(highEndLapTop.getSegment());
        System.out.println(highEndPhone.getSegment());
        System.out.println("==================================");

        ElectronicDeviceAbstractFactory midRangeFactory = ElectronicDeviceFactory.getFactory(Segment.MID_RANGE);
        LapTop midRangeLapTop = midRangeFactory.getLabTop();
        Phone midRangePhone = midRangeFactory.getPhone();
        System.out.println(midRangeLapTop.getSegment());
        System.out.println(midRangePhone.getSegment());
    }
}
