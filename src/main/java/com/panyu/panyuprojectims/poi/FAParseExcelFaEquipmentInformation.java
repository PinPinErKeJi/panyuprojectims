package com.panyu.panyuprojectims.poi;

import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.FaEquipmentInformationService;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.InputStream;

public class FAParseExcelFaEquipmentInformation {
    /**
     * 解析导入工程基本信息的方法。getCellValue
     */
    public static void parseAndImportModule(InputStream inputStream, String fileName, FaEquipmentInformationService faEquipmentInformationService){
        if(fileName.toLowerCase().endsWith("xls")){
            try {
                // 将流中数据实例化为 HSSFWorkbook。
                HSSFWorkbook wb = new HSSFWorkbook(inputStream);
                // 获取sheet工作簿
                HSSFSheet sheet = wb.getSheetAt(0);
                int hang = 0;
                // 获取表中所有行
                hang = sheet.getPhysicalNumberOfRows();

                for (int h = 2; h < hang; h++) {
                    //创建对象
                     FaEquipmentInformation faEquipmentInformation = new FaEquipmentInformation();
                     FaFiberOpticChannel faFiberOpticChannel = new FaFiberOpticChannel();
                     FaCabinetPowerFrame faCabinetPowerFrame = new FaCabinetPowerFrame();
                     FaBoardcardDilatation faBoardcardDilatation = new FaBoardcardDilatation();
                     FaPigtailSkipFiber faPigtailSkipFiber = new FaPigtailSkipFiber();
                     FaPowerNetworkLine faPowerNetworkLine = new FaPowerNetworkLine();
                     FaWalkingFrame faWalkingFrame = new FaWalkingFrame();
                    // 获取当前行数据
                    HSSFRow row = sheet.getRow(h);

                    String operator= GetCellValue.getCellValue(row, 0);
                    String buildYear= GetCellValue.getCellValue(row, 1);
                    String buildingProject= GetCellValue.getCellValue(row, 2);
                    String motorRoomName= GetCellValue.getCellValue(row, 3);
                    String motorRoomLongitude= GetCellValue.getCellValue(row, 4);
                    String motorRoomLatitude= GetCellValue.getCellValue(row, 5);
                    String province= GetCellValue.getCellValue(row, 6);
                    String city= GetCellValue.getCellValue(row, 7);
                    String county= GetCellValue.getCellValue(row, 8);
                    String onSiteSupervision= GetCellValue.getCellValue(row, 9);
                    String projectLeader= GetCellValue.getCellValue(row, 10);
                    String equipmentNumber= GetCellValue.getCellValue(row, 11);
                    String equipmentType= GetCellValue.getCellValue(row, 12);
                    String equipmentName= GetCellValue.getCellValue(row, 13);
                    String equipmentModel= GetCellValue.getCellValue(row, 14);
                    String equipmentDesignQuantity= GetCellValue.getCellValue(row, 15);
                    String equipmentSize= GetCellValue.getCellValue(row, 16);
                    String equipmentSupplier= GetCellValue.getCellValue(row, 17);
                    String equipmentContacts= GetCellValue.getCellValue(row, 18);
                    String boardCardNumber= GetCellValue.getCellValue(row, 19);
                    String boardCardName= GetCellValue.getCellValue(row, 20);
                    String veneerFunction= GetCellValue.getCellValue(row, 21);
                    String placeEquipment= GetCellValue.getCellValue(row, 22);
                    String boardCardDesignQuantity= GetCellValue.getCellValue(row, 23);
                    String boardCardSupplier= GetCellValue.getCellValue(row, 24);
                    String boardCardContacts= GetCellValue.getCellValue(row, 25);
                    String powerNumber= GetCellValue.getCellValue(row, 26);
                    String cableType= GetCellValue.getCellValue(row, 27);
                    String specificationModel= GetCellValue.getCellValue(row, 28);
                    String numberOfBranches= GetCellValue.getCellValue(row, 29);
                    String singleLength= GetCellValue.getCellValue(row, 30);
                    String totalLength= GetCellValue.getCellValue(row, 31);
                    String froms= GetCellValue.getCellValue(row, 32);
                    String to1= GetCellValue.getCellValue(row, 33);
                    String powerSupplier= GetCellValue.getCellValue(row, 34);
                    String powerContacts= GetCellValue.getCellValue(row, 35);
                    String pigtailNumber= GetCellValue.getCellValue(row, 36);
                    String fiberCableType= GetCellValue.getCellValue(row, 37);
                    String fiberSpecificationModel= GetCellValue.getCellValue(row, 38);
                    String fiberNumberOfBranches= GetCellValue.getCellValue(row, 39);
                    String fiberSingleLength= GetCellValue.getCellValue(row, 40);
                    String forms= GetCellValue.getCellValue(row, 41);
                    String to2= GetCellValue.getCellValue(row, 42);
                    String fiberSupplier= GetCellValue.getCellValue(row, 43);
                    String fiberContacts= GetCellValue.getCellValue(row, 44);
                    String walkingNumber= GetCellValue.getCellValue(row, 45);
                    String walkingDesignLength= GetCellValue.getCellValue(row, 46);
                    String walkingFrameSupplier= GetCellValue.getCellValue(row, 47);
                    String walkingFrameContacts= GetCellValue.getCellValue(row, 48);
                    String fiberOpticNumber= GetCellValue.getCellValue(row, 49);
                    String fiberOpticDesignLength= GetCellValue.getCellValue(row, 50);
                    String fiberOpticSupplier= GetCellValue.getCellValue(row, 51);
                    String fiberOpticContacts= GetCellValue.getCellValue(row, 52);


                    faEquipmentInformation.setOperator(operator);
                    faEquipmentInformation.setBuildYear(buildYear);
                    faEquipmentInformation.setBuildingProject(buildingProject);
                    faEquipmentInformation.setMotorRoomName(motorRoomName);
                    faEquipmentInformation.setMotorRoomLongitude(motorRoomLongitude);
                    faEquipmentInformation.setMotorRoomLatitude(motorRoomLatitude);
                    faEquipmentInformation.setProvince(province);
                    faEquipmentInformation.setCity(city);
                    faEquipmentInformation.setCounty(county);
                    faEquipmentInformation.setOnSiteSupervision(onSiteSupervision);
                    faEquipmentInformation.setProjectLeader(projectLeader);
                    //1.
                    faEquipmentInformation.setEquipmentNumber(faCabinetPowerFrame.getEquipmentNumber());
                    faEquipmentInformation.setEquipmentType(faCabinetPowerFrame.getEquipmentType());
                    faEquipmentInformation.setEquipmentName(faCabinetPowerFrame.getEquipmentName());
                    faEquipmentInformation.setEquipmentModel(faCabinetPowerFrame.getEquipmentModel());
                    faEquipmentInformation.setEquipmentDesignQuantity(faCabinetPowerFrame.getEquipmentDesignQuantity());
                    faEquipmentInformation.setEquipmentSize(faCabinetPowerFrame.getEquipmentSize());
                    faEquipmentInformation.setEquipmentSupplier(faCabinetPowerFrame.getEquipmentSupplier());
                    faEquipmentInformation.setEquipmentContacts(faCabinetPowerFrame.getEquipmentContacts());
                    //2.
                    faEquipmentInformation.setBoardCardNumber(faBoardcardDilatation.getBoardCardNumber());
                    faEquipmentInformation.setBoardCardName(faBoardcardDilatation.getBoardCardName());
                    faEquipmentInformation.setVeneerFunction(faBoardcardDilatation.getVeneerFunction());
                    faEquipmentInformation.setPlaceEquipment(faBoardcardDilatation.getPlaceEquipment());
                    faEquipmentInformation.setBoardCardDesignQuantity(faBoardcardDilatation.getBoardCardDesignQuantity());
                    faEquipmentInformation.setBoardCardSupplier(faBoardcardDilatation.getBoardCardSupplier());
                    faEquipmentInformation.setBoardCardContacts(faBoardcardDilatation.getBoardCardContacts());
                    //3.
                    faEquipmentInformation.setPowerNumber(faPowerNetworkLine.getPowerNumber());
                    faEquipmentInformation.setCableType(faPowerNetworkLine.getCableType());
                    faEquipmentInformation.setSpecificationModel(faPowerNetworkLine.getSpecificationModel());
                    faEquipmentInformation.setNumberOfBranches(faPowerNetworkLine.getNumberOfBranches());
                    faEquipmentInformation.setSingleLength(faPowerNetworkLine.getSingleLength());
                    faEquipmentInformation.setTotalLength(faPowerNetworkLine.getTotalLength());
                    faEquipmentInformation.setFroms(faPowerNetworkLine.getFroms());
                    faEquipmentInformation.setTo1(faPowerNetworkLine.getTo1());
                    faEquipmentInformation.setPowerSupplier(faPowerNetworkLine.getPowerSupplier());
                    faEquipmentInformation.setPowerContacts(faPowerNetworkLine.getPowerContacts());
                    //4.
                    faEquipmentInformation.setPigtailNumber(faPigtailSkipFiber.getPigtailNumber());
                    faEquipmentInformation.setFiberCableType(faPigtailSkipFiber.getFiberCableType());
                    faEquipmentInformation.setFiberSpecificationModel(faPigtailSkipFiber.getFiberSpecificationModel());
                    faEquipmentInformation.setFiberNumberOfBranches(faPigtailSkipFiber.getFiberNumberOfBranches());
                    faEquipmentInformation.setFiberSingleLength(faPigtailSkipFiber.getFiberSingleLength());
                    faEquipmentInformation.setForms(faPigtailSkipFiber.getForms());
                    faEquipmentInformation.setTo2(faPigtailSkipFiber.getTo2());
                    faEquipmentInformation.setFiberSupplier(faPigtailSkipFiber.getFiberSupplier());
                    faEquipmentInformation.setFiberContacts(faPigtailSkipFiber.getFiberContacts());
                    //5.
                    faEquipmentInformation.setWalkingNumber(faWalkingFrame.getWalkingNumber());
                    faEquipmentInformation.setWalkingDesignLength(faWalkingFrame.getWalkingDesignLength());
                    faEquipmentInformation.setWalkingFrameSupplier(faWalkingFrame.getWalkingFrameSupplier());
                    faEquipmentInformation.setWalkingFrameContacts(faWalkingFrame.getWalkingFrameContacts());
                    //6.
                    faEquipmentInformation.setFiberOpticNumber(faFiberOpticChannel.getFiberOpticNumber());
                    faEquipmentInformation.setFiberOpticDesignLength(faFiberOpticChannel.getFiberOpticDesignLength());
                    faEquipmentInformation.setFiberOpticSupplier(faFiberOpticChannel.getFiberOpticSupplier());
                    faEquipmentInformation.setFiberOpticContacts(faFiberOpticChannel.getFiberOpticContacts());




                    faEquipmentInformationService.add( faFiberOpticChannel.getFiberOpticChannelId(),  fiberOpticNumber,  fiberOpticDesignLength,
                             fiberOpticSupplier,  fiberOpticContacts,  faPigtailSkipFiber.getPigtailSkipFiberId(),
                             pigtailNumber,  fiberCableType,  fiberSpecificationModel,
                             fiberNumberOfBranches,  fiberSingleLength,  forms,  to2,
                             fiberSupplier,  fiberContacts,  faPowerNetworkLine.getPowerNetworkLineId(),  powerNumber,
                             cableType,  specificationModel,  numberOfBranches,  singleLength,
                             totalLength,  froms,  to1,  powerSupplier,  powerContacts,
                            faWalkingFrame.getWalkingFrameId(),  walkingNumber,  walkingDesignLength,  walkingFrameSupplier,
                             walkingFrameContacts,  faBoardcardDilatation.getBoardCardDilatationId(),  boardCardNumber,  boardCardName,
                             veneerFunction,  placeEquipment,  boardCardDesignQuantity,  boardCardSupplier,
                             boardCardContacts,  faCabinetPowerFrame.getEquipmentId(),  equipmentNumber,  equipmentType,
                             equipmentName,  equipmentModel,  equipmentDesignQuantity,  equipmentSize,
                             equipmentSupplier,  equipmentContacts,  faEquipmentInformation.getEquipmentInformationId(),  operator,
                             buildYear,  buildingProject,  motorRoomName,  motorRoomLongitude,
                             motorRoomLatitude,  province,  city,  county,  onSiteSupervision,
                             projectLeader);
                }

                inputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
