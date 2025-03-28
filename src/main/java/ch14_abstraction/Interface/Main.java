package ch14_abstraction.Interface;
/*
    VolumeDownButton / VolumeUpButton 클래스를 생성하고
    얘를 TvRemoteController의 필드에 추가하고
    onPressedVolumeDownButton() / onDownVolumeDownButton()
    onPressedVolumeUpButton() / onUpVolumeUpButton() 메서드를 정의하시고
    Main에서
    음량을 한 칸 내립니다.
    음량을 계속 내립니다.
    음량을 한 칸 올립니다.
    음량을 계속 올립니다.
 */
public class Main {
    public static void main(String[] args) {


        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(), new VolumeDownButton(), new VolumeUpButton());

        ACController acController = new ACController(new TempDownButton(), new TempUpButton());

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedPowerButton();

        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        System.out.println();
        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onUpChannelUpButton();
        System.out.println();
        tvRemoteController.onPressedVolumeDownButton();

        System.out.println();
        tvRemoteController.onPressedVolumeUpButton();

              System.out.println();
        tvRemoteController.onPressedPowerButton();
        acController.onPressTempDownButton();
        acController.onDownTempDownButton();
        acController.onPressTempUpButton();
        acController.onUpTempUpButton();
        tvRemoteController.onPressedPowerButton();




    }
}