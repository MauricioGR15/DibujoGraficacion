import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

public class Atardecer extends JFrame {

    public static void main(String[] args) {
        new Atardecer();
    }

    private Atardecer(){
        setSize(1286,732);
        repaint();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g){

        Color morado = new Color(99, 83, 146);
        Color lilita = new Color(132,56,128);
        Color oscurito = new Color(108,46,109);

        //FONDO DEGRADADO

        Graphics2D g2 = (Graphics2D)g;
        g2.setPaint(new GradientPaint(200, 50,
                new Color(61, 80, 140), 200, 400,
                new Color(205, 118, 169)));
        g2.fillRect(0,0,1286,650);

        //SOL, MONTAÑAS Y MAR

        Color sol1 = new Color(255,189,113);
        Color sol2 = new Color(255,210,140);
        Color colores[] = {sol2,sol1};
        float[] dist = {0.5f, 1.0f };
        Point2D centro = new Point2D.Float(1100,325);
        RadialGradientPaint gradienteRadial = new RadialGradientPaint(centro,50,dist,colores);
        g2.setPaint(gradienteRadial);
        g2.fillOval(1045,271,100,100);

        g.setColor(new Color(150,101,157));
        int aX[] = {845,913,1010,926};
        int aY[] = {416,353,474,555};
        g.fillPolygon(aX,aY,aX.length);

        g.setColor(new Color(127,91,155));
        int bX[] = {1006,1030,1068,1087,1097,1071};
        int bY[] = {474,423,500,476,488,545};
        g.fillPolygon(bX,bY,bX.length);

        g.setColor(new Color(148,101,156));
        int cX[] = {384,516,670,652,512,400};
        int xY[] = {520,414,508,550,557,550};
        g.fillPolygon(cX,xY,cX.length);

        g.setColor(new Color(150,101,157));
        int dX[] = {1146,1249,1284,1216};
        int dY[] = {490,340,396,518};
        g.fillPolygon(dX,dY,dX.length);

        g.setColor(morado);
        int x[] = {0, 35, 0};
        int y[] = {484, 530, 571};
        g.fillPolygon(x, y, 3);

        g.setColor(lilita);
        int x2[] = {0,55,47,38,0};
        int y2[] = {571,505,555,545,587};
        g.fillPolygon(x2,y2,x2.length);

        g.setColor(oscurito);
        int x3[] = {0,38,47,55,102,0};
        int y3[] =  {587,545,555,505,550,587};
        g.fillPolygon(x3,y3,x3.length);

        g.setColor(new Color(125,94,153));
        int x4[] = {6,85,179,130,102,55,35};
        int y4[] =  {494,410,484,538,555,505,530};
        g.fillPolygon(x4,y4,x4.length);

        g.setColor(lilita);
        int x5[] = {0,130,193,210,214,217,224,223,239,237,247,269,226,210,176,131,0};
        int y5[] = {587,538,468,462,477,467,474,465,482,462,471,555,533,556,550,625,647};
        g.fillPolygon(x5,y5,x5.length);

        g.setColor(Color.WHITE);
        int x6[] = {193,234,247,237,239,223,224,217,214,210};
        int y6[] =  {468,421,471,462,482,465,474,467,477,462};
        g.fillPolygon(x6,y6,x6.length);

        g.setColor(new Color(145,223,227));
        int x7[] = {234,270,266,270,262,265,257,254,245};
        int y7[] =  {421,453,454,458,460,467,461,474,466};
        g.fillPolygon(x7,y7,x7.length);

        g.setColor(oscurito);
        int x8[] = {131,176,210,226,269,245,254,257,265,262,270,266,270,456,444};
        int y8[] =  {625,550,556,533,555,466,474,461,467,460,458,454,453,628,645};
        g.fillPolygon(x8,y8,x8.length);

        g.setColor(new Color(67,118,99));
        int x9[] = {0,10,50,131,230,444,462,498,600,668,585,0};
        int y9[] = {645,639,635,625,622,645,648,643,650,648,677,668};
        g.fillPolygon(x9,y9,x9.length);

        g.setColor(new Color(0,55,106));
        int x10[] = {0,172,181,191,237,265,0};
        int y10[] = {668,670,685,695,714,724,724};
        g.fillPolygon(x10,y10,x10.length);

        g.setColor(new Color(0,59,115));
        int x11[] = {172,239,253,287,356,404,265,237,191,181};
        int y11[] = {670,670,687,700,710,724,724,714,695,685};
        g.fillPolygon(x11,y11,x11.length);

        g.setColor(new Color(3,77,140));
        int x12[] = {239,320,341,371,405,425,439,585,527,486,480,480,505,724,705,404,356,287,253,239};
        int y12[] = {670,670,681,685,685,681,674,677,685,684,698,700,707,712,724,724,710,700,687,670};
        g.fillPolygon(x12,y12,x12.length);

        g.setColor(new Color(0,67,135));
        int x13[] = {320,439,425,405,371,341};
        int y13[] = {670,674,681,685,685,681};
        g.fillPolygon(x13,y13,x13.length);

        g.setColor(new Color(0,67,135));
        int x14[] = {575,527,486,480,480,505,730,740,516};
        int y14[] = {678,685,684,698,700,707,713,702,702};
        g.fillPolygon(x14,y14,x14.length);

        g.setColor(new Color(125,94,153));
        int x15[] = {309,330,384,362};
        int y15[] = {490,463,520,540};
        g.fillPolygon(x15,y15,x15.length);

        g.setColor(morado);
        int x16[] = {362,384,399,378};
        int y16[] = {539,520,534,555};
        g.fillPolygon(x16,y16,x16.length);

        g.setColor(lilita);
        int x17[] = {378,405,411,412,420,425,457};
        int y17[] = {555,523,525,532,518,523,630};
        g.fillPolygon(x17,y17,x17.length);

        g.setColor(new Color(255,255,255));
        int x18[] = {405,420,426,420,412,411};
        int y18[] = {523,506,524,519,532,525};
        g.fillPolygon(x18,y18,x18.length);

        g.setColor(new Color(145,223,227));
        int x19[] = {420,440,431,447,426,426};
        int y19[] = {506,516,518,524,518,524};
        g.fillPolygon(x19,y19,x19.length);

        g.setColor(oscurito);
        int x20[] = {457,425,426,447,431,440,514};
        int y20[] = {630,524,518,524,518,516,548};
        g.fillPolygon(x20,y20,x20.length);

        g.setColor(lilita);
        int x21[] = {440,554,572,568,582,585,575,604,630,752,761,765,770,772,740,728,660,600,450};
        int y21[] = {646,494,483,511,482,496,576,546,570,360,355,369,355,360,548,520,650,654,648};
        g.fillPolygon(x21,y21,x21.length);

        g.setColor(new Color(255,255,255));
        int x22[] = {554,590,585,582,568,572};
        int y22[] = {494,445,496,482,511,483};
        g.fillPolygon(x22,y22,x22.length);

        g.setColor(oscurito);
        int x23[] = {573,604,630,653,618,612,618,602,608,596,591,585};
        int y23[] = {577,547,570,532,485,479,492,476,496,482,502,492};
        g.fillPolygon(x23,y23,x23.length);

        g.setColor(new Color(145,223,227));
        int x24[] = {585,590,618,612,618,602,608,596,591};
        int y24[] = {492,445,485,479,492,476,496,482,502};
        g.fillPolygon(x24,y24,x24.length);

        g.setColor(new Color(255,255,255));
        int x26[] = {752,782,772,770,765,761};
        int y26[] = {360,305,360,355,369,355};
        g.fillPolygon(x26,y26,x26.length);

        g.setColor(new Color(145,223,227));
        int x27[] = {772,785,788,796,799,806,807,815,782};
        int y27[] = {360,375,352,366,356,375,351,358,305};
        g.fillPolygon(x27,y27,x27.length);

        g.setColor(oscurito);
        int x28[] = {772,785,788,796,799,806,807,815,972,660,728,740};
        int y28[] = {360,375,352,366,356,375,351,358,624,650,519,548};
        g.fillPolygon(x28,y28,x28.length);

        g.setColor(new Color(64,140,127));
        int x29[] = {514,580,735,813,870,971,1017,986,950,890,845,790,738};
        int y29[] = {702,674,620,609,609,624,635,693,667,650,681,670,702};
        g.fillPolygon(x29,y29,x29.length);

        g.setColor(new Color(124,46,113));
        int x30[] = {705,791,772};
        int y30[] = {724,666,724};
        g.fillPolygon(x30,y30,x30.length);

        g.setColor(new Color(101,37,97));
        int x31[] = {772,791,845,890,950,1029};
        int y31[] = {724,666,681,650,667,724};
        g.fillPolygon(x31,y31,x31.length);

        g.setColor(lilita);
        int x32[] = {928,988,994,983,1010,1034,1017,970};
        int y32[] = {550,460,463,553,536,605,635,624};
        g.fillPolygon(x32,y32,x32.length);

        g.setColor(oscurito);
        int x33[] = {988,994,1032,1072,1034,1010,983};
        int y33[] = {460,463,482,529,605,536,553};
        g.fillPolygon(x33,y33,x33.length);

        g.setColor(new Color(122,46,117));
        int x34[] = {985,1098,1150,1110,1044,1021};
        int y34[] = {693,478,602,586,724,724};
        g.fillPolygon(x34,y34,x34.length);

        g.setColor(new Color(255,255,255));
        int x35[] = {1056,1098,1115,1110,1092};
        int y35[] = {558,477,519,546,529};
        g.fillPolygon(x35,y35,x35.length);

        g.setColor(new Color(77,38,77));
        int x36[] = {1044,1110,1149,1098,1284,1284};
        int y36[] = {724,586,601,477,530,724};
        g.fillPolygon(x36,y36,x36.length);

        g.setColor(new Color(145,223,227));
        int x37[] = {1098,1166,1158,1184,1140,1152,1115};
        int y37[] = {477,496,497,512,500,535,519};
        g.fillPolygon(x37,y37,x37.length);

        g.setColor(new Color(116,43,112));
        int x38[] = {1216,1285,1284};
        int y38[] = {511,394,530};
        g.fillPolygon(x38,y38,x38.length);

        g.setColor(new Color(0,131,79));

        int x39[] = {759,767,772};
        int y39[] = {724,692,724};
        g.fillPolygon(x39,y39,x39.length);

        int x40[] = {784,787,790};
        int y40[] = {724,705,724};
        g.fillPolygon(x40,y40,x40.length);

        int x41[] = {816,821,826};
        int y41[] = {724,695,724};
        g.fillPolygon(x41,y41,x41.length);

        int x42[] = {844,849,854};
        int y42[] = {724,694,724};
        g.fillPolygon(x42,y42,x42.length);

        int x43[] = {863,869,875};
        int y43[] = {724,680,724};
        g.fillPolygon(x43,y43,x43.length);

        int x44[] = {880,889,898};
        int y44[] = {723,690,724};
        g.fillPolygon(x44,y44,x44.length);

        int x45[] = {913,923,934};
        int y45[] = {724,677,724};
        g.fillPolygon(x45,y45,x45.length);

        int x46[] = {959,964,968};
        int y46[] = {724,693,724};
        g.fillPolygon(x46,y46,x46.length);

        int x47[] = {974,982,993};
        int y47[] = {724,681,724};
        g.fillPolygon(x47,y47,x47.length);

        int x48[] = {1006,1012,1019};
        int y48[] = {724,686,724};
        g.fillPolygon(x48,y48,x48.length);

        int x49[] = {1041,1051,1060};
        int y49[] = {724,688,724};
        g.fillPolygon(x49,y49,x49.length);

        int x50[] = {1086,1101,1111};
        int y50[] = {724,652,724};
        g.fillPolygon(x50,y50, x50.length);

        int x51[] = {1130,1143,1151};
        int y51[] = {724,679,724};
        g.fillPolygon(x51,y51,x51.length);

        int x52[] = {1157,1175,1185};
        int y52[] = {724,629,724};
        g.fillPolygon(x52,y52,x52.length);

        int x53[] = {1205,1214,1225};
        int y53[] = {724,682,724};
        g.fillPolygon(x53,y53,x53.length);

        int x54[] = {1244,1252,1267};
        int y54[] = {724,657,724};
        g.fillPolygon(x54,y54,x54.length);

        //POLIGONOS DE CIUDAD Y BARCOS

        g.setColor(new Color(55,170,199));
        int barcoX[] = {428,430,435,435,432,432,443,443,450,445};
        int barcoY[] = {689,685,685,683,683,680,682,684,684,689};
        g.fillPolygon(barcoX,barcoY,barcoX.length);

        int velaX[] = {452,455,462,470,472,470,455};
        int velaY[] = {708,708,693,707,707,712,712};
        g.fillPolygon(velaX,velaY,velaX.length);

        g.setColor(new Color(212,104,29));
        g.fillRect(582,694,8,5);
        g.fillRect(656,672,7,7);
        g.fillRect(630,682,5,8);

        int trianguloX[] = {630,632,634};
        int trianguloY[] = {675,669,675};
        g.fillPolygon(trianguloX,trianguloY,trianguloX.length);

        int triangulo2X[] = {659,664};
        int triangulo2Y[] = {696,686,696};
        g.fillPolygon(triangulo2X,triangulo2Y,triangulo2X.length);

        int triangulo3X[] = {604,611,616,610};
        int triangulo3Y[] = {705,699,699,705};
        g.fillPolygon(triangulo3X,triangulo3Y,triangulo3X.length);

        g.setColor(new Color(220,225,219));
        g.fillRect(585,685,15,7);
        g.fillRect(615,673,5,4);
        g.fillRect(602,692,4,8);
        g.fillRect(625,679,6,11);
        g.fillRect(663,668,8,8);
        g.fillRect(651,684,10,10);
        g.fillRect(670,680,5,5);

        g.setColor(new Color(11,102,87));
        g.fillRect(590,680,10,5);
        g.fillRect(638,690,12,10);
        g.fillRect(667,669,10,6);

        //PINOS

        g.setColor(new Color(63,130,149));
        int pino1X[] = {20,23,26};
        int pino1Y[] = {600,587,600};
        g.fillPolygon(pino1X,pino1Y,pino1X.length);

        int pino2X[] = {109,112,115};
        int pino2Y[] = {592,579,592};
        g.fillPolygon(pino2X,pino2Y,pino2X.length);

        int pino3X[] = {101,104,107};
        int pino3Y[] = {569,556,569};
        g.fillPolygon(pino3X,pino3Y,pino3X.length);

        int pino4X[] = {145,148,151};
        int pino4Y[] = {580,567,580};
        g.fillPolygon(pino4X,pino4Y,pino4X.length);

        int pino5X[] = {141,144,147};
        int pino5Y[] = {542,529,542};
        g.fillPolygon(pino5X,pino5Y,pino5X.length);

        int pino6X[] = {156,159,162};
        int pino6Y[] = {557,544,557};
        g.fillPolygon(pino6X,pino6Y,pino6X.length);

        int pino7X[] = {184,187,190};
        int pino7Y[] = {540,527,540};
        g.fillPolygon(pino7X,pino7Y,pino7X.length);

        int pino8X[] = {183,186,189};
        int pino8Y[] = {500,487,500};
        g.fillPolygon(pino8X,pino8Y,pino8X.length);

        int pino9X[] = {197,200,203};
        int pino9Y[] = {504,491,504};
        g.fillPolygon(pino9X,pino9Y,pino9X.length);

        int pino10X[] = {500,503,506};
        int pino10Y[] = {615,602,615};
        g.fillPolygon(pino10X,pino10Y,pino10X.length);

        int pino11X[] = {503,506,509};
        int pino11Y[] = {591,578,591};
        g.fillPolygon(pino11X,pino11Y,pino11X.length);

        int pino12X[] = {534,537,540};
        int pino12Y[] = {592,579,592};
        g.fillPolygon(pino12X,pino12Y,pino12X.length);

        int pino13X[] = {521,524,527};
        int pino13Y[] = {566,553,566};
        g.fillPolygon(pino13X,pino13Y,pino13X.length);

        int pino14X[] = {541,544,547};
        int pino14Y[] = {569,556,569};
        g.fillPolygon(pino14X,pino14Y,pino14X.length);

        int pino15X[] = {537,540,543};
        int pino15Y[] = {550,537,550};
        g.fillPolygon(pino15X,pino15Y,pino15X.length);

        int pino16X[] = {707,710,713};
        int pino16Y[] = {457,444,457};
        g.fillPolygon(pino16X,pino16Y,pino16X.length);

        int pino17X[] = {732,735,738};
        int pino17Y[] = {470,457,470};
        g.fillPolygon(pino17X,pino17Y,pino17X.length);

        int pino18X[] = {732,735,738};
        int pino18Y[] = {430,417,430};
        g.fillPolygon(pino18X,pino18Y,pino18X.length);

        int pino19X[] = {742,745,748};
        int pino19Y[] = {445,432,445};
        g.fillPolygon(pino19X,pino19Y,pino19X.length);

        int pino20X[] = {970,973,976};
        int pino20Y[] = {592,579,592};
        g.fillPolygon(pino20X,pino20Y,pino20X.length);

        int pino21X[] = {985,988,991};
        int pino21Y[] = {582,569,582};
        g.fillPolygon(pino21X,pino21Y,pino21X.length);

        int pino22X[] = {995,998,1001};
        int pino22Y[] = {564,551,564};
        g.fillPolygon(pino22X,pino22Y,pino22X.length);

        int pino23X[] = {1025,1028,1031};
        int pino23Y[] = {648,635,648};
        g.fillPolygon(pino23X,pino23Y,pino23X.length);

        int pino25X[] = {1050,1053,1056};
        int pino25Y[] = {620,607,620};
        g.fillPolygon(pino25X,pino25Y,pino25X.length);

        int pino26X[] = {1074,1077,1080};
        int pino26Y[] = {626,613,626};
        g.fillPolygon(pino26X,pino26Y,pino26X.length);

        int pino27X[] = {1245,1248,1251};
        int pino27Y[] = {481,468,481};
        g.fillPolygon(pino27X,pino27Y,pino27X.length);

        int pino28X[] = {1270,1273,1276};
        int pino28Y[] = {491,478,491};
        g.fillPolygon(pino28X,pino28Y,pino28X.length);

        int pino29X[] = {1270,1273,1276};
        int pino29Y[] = {452,439,452};
        g.fillPolygon(pino29X,pino29Y,pino29X.length);

        //PINOS BICOLOR

        g.setColor(new Color(174,169,189));
        int pinoBiColor1X[] = {35,39,39};
        int pinoBiColor1Y[] = {592,577,592};
        g.fillPolygon(pinoBiColor1X,pinoBiColor1Y,pinoBiColor1X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor21X[] = {39,39,43};
        int pinoBiColor21Y[] = {592,577,592};
        g.fillPolygon(pinoBiColor21X,pinoBiColor21Y,pinoBiColor21X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor2X[] = {128,132,132};
        int pinoBiColor2Y[] = {585,570,585};
        g.fillPolygon(pinoBiColor2X,pinoBiColor2Y,pinoBiColor2X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor22X[] = {132,132,136};
        int pinoBiColor22Y[] = {585,570,585};
        g.fillPolygon(pinoBiColor22X,pinoBiColor22Y,pinoBiColor22X.length);



        g.setColor(new Color(174,169,189));
        int pinoBiColor3X[] = {127,131,131};
        int pinoBiColor3Y[] = {556,541,556};
        g.fillPolygon(pinoBiColor3X,pinoBiColor3Y,pinoBiColor3X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor23X[] = {131,131,135};
        int pinoBiColor23Y[] = {556,541,556};
        g.fillPolygon(pinoBiColor23X,pinoBiColor23Y,pinoBiColor23X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor4X[] = {138,142,142};
        int pinoBiColor4Y[] = {556,541,556};
        g.fillPolygon(pinoBiColor4X,pinoBiColor4Y,pinoBiColor4X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor24X[] = {142,142,146};
        int pinoBiColor24Y[] = {556,541,556};
        g.fillPolygon(pinoBiColor24X,pinoBiColor24Y,pinoBiColor24X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor5X[] = {166,170,170};
        int pinoBiColor5Y[] = {545,530,545};
        g.fillPolygon(pinoBiColor5X,pinoBiColor5Y,pinoBiColor5X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor25X[] = {170,170,174};
        int pinoBiColor25Y[] = {545,530,545};
        g.fillPolygon(pinoBiColor25X,pinoBiColor25Y,pinoBiColor25X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor6X[] = {176,180,180};
        int pinoBiColor6Y[] = {526,511,526};
        g.fillPolygon(pinoBiColor6X,pinoBiColor6Y,pinoBiColor6X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor26X[] = {180,180,184};
        int pinoBiColor26Y[] = {526,511,526};
        g.fillPolygon(pinoBiColor26X,pinoBiColor26Y,pinoBiColor26X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor7X[] = {202,206,206};
        int pinoBiColor7Y[] = {534,519,534};
        g.fillPolygon(pinoBiColor7X,pinoBiColor7Y,pinoBiColor7X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor27X[] = {206,206,210};
        int pinoBiColor27Y[] = {534,519,534};
        g.fillPolygon(pinoBiColor27X,pinoBiColor27Y,pinoBiColor27X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor8X[] = {489,493,493};
        int pinoBiColor8Y[] = {600,585,600};
        g.fillPolygon(pinoBiColor8X,pinoBiColor8Y,pinoBiColor8X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor28X[] = {493,493,497};
        int pinoBiColor28Y[] = {600,585,600};
        g.fillPolygon(pinoBiColor28X,pinoBiColor28Y,pinoBiColor28X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor9X[] = {520,524,524};
        int pinoBiColor9Y[] = {585,570,585};
        g.fillPolygon(pinoBiColor9X,pinoBiColor9Y,pinoBiColor9X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor29X[] = {524,524,528};
        int pinoBiColor29Y[] = {585,570,585};
        g.fillPolygon(pinoBiColor29X,pinoBiColor29Y,pinoBiColor29X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor10X[] = {550,554,554};
        int pinoBiColor10Y[] = {584,569,584};
        g.fillPolygon(pinoBiColor10X,pinoBiColor10Y,pinoBiColor10X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor210X[] = {554,554,558};
        int pinoBiColor210Y[] = {584,569,584};
        g.fillPolygon(pinoBiColor210X,pinoBiColor210Y,pinoBiColor210X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor11X[] = {713,717,717};
        int pinoBiColor11Y[] = {473,458,473};
        g.fillPolygon(pinoBiColor11X,pinoBiColor11Y,pinoBiColor11X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor211X[] = {717,717,721};
        int pinoBiColor211Y[] = {473,458,473};
        g.fillPolygon(pinoBiColor211X,pinoBiColor211Y,pinoBiColor211X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor12X[] = {724,728,728};
        int pinoBiColor12Y[] = {454,439,454};
        g.fillPolygon(pinoBiColor12X,pinoBiColor12Y,pinoBiColor12X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor212X[] = {728,728,732};
        int pinoBiColor212Y[] = {454,439,454};
        g.fillPolygon(pinoBiColor212X,pinoBiColor212Y,pinoBiColor212X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor13X[] = {969,973,973};
        int pinoBiColor13Y[] = {569,554,569};
        g.fillPolygon(pinoBiColor13X,pinoBiColor13Y,pinoBiColor13X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor213X[] = {973,973,977};
        int pinoBiColor213Y[] = {569,554,569};
        g.fillPolygon(pinoBiColor213X,pinoBiColor213Y,pinoBiColor213X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor14X[] = {977,981,981};
        int pinoBiColor14Y[] = {607,592,607};
        g.fillPolygon(pinoBiColor14X,pinoBiColor14Y,pinoBiColor14X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor214X[] = {981,981,985};
        int pinoBiColor214Y[] = {607,592,607};
        g.fillPolygon(pinoBiColor214X,pinoBiColor214Y,pinoBiColor214X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor15X[] = {1010,1014,1014};
        int pinoBiColor15Y[] = {596,581,596};
        g.fillPolygon(pinoBiColor15X,pinoBiColor15Y,pinoBiColor15X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor215X[] = {1014,1014,1018};
        int pinoBiColor215Y[] = {596,581,596};
        g.fillPolygon(pinoBiColor215X,pinoBiColor215Y,pinoBiColor215X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor16X[] = {1032,1036,1036};
        int pinoBiColor16Y[] = {664,649,664};
        g.fillPolygon(pinoBiColor16X,pinoBiColor16Y,pinoBiColor16X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor216X[] = {1036,1036,1040};
        int pinoBiColor216Y[] = {664,649,664};
        g.fillPolygon(pinoBiColor216X,pinoBiColor216Y,pinoBiColor216X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor17X[] = {1043,1047,1047};
        int pinoBiColor17Y[] = {638,623,638};
        g.fillPolygon(pinoBiColor17X,pinoBiColor17Y,pinoBiColor17X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor217X[] = {1047,1047,1051};
        int pinoBiColor217Y[] = {638,623,638};
        g.fillPolygon(pinoBiColor217X,pinoBiColor217Y,pinoBiColor217X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor18X[] = {1054,1058,1058};
        int pinoBiColor18Y[] = {597,582,597};
        g.fillPolygon(pinoBiColor18X,pinoBiColor18Y,pinoBiColor18X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor218X[] = {1058,1058,1062};
        int pinoBiColor218Y[] = {597,582,597};
        g.fillPolygon(pinoBiColor218X,pinoBiColor218Y,pinoBiColor218X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor19X[] = {1083,1087,1087};
        int pinoBiColor19Y[] = {603,588,603};
        g.fillPolygon(pinoBiColor19X,pinoBiColor19Y,pinoBiColor19X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor219X[] = {1087,1087,1091};
        int pinoBiColor219Y[] = {603,588,603};
        g.fillPolygon(pinoBiColor219X,pinoBiColor219Y,pinoBiColor219X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor20X[] = {1252,1256,1256};
        int pinoBiColor20Y[] = {496,481,496};
        g.fillPolygon(pinoBiColor20X,pinoBiColor20Y,pinoBiColor20X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor220X[] = {1256,1256,1260};
        int pinoBiColor220Y[] = {496,481,496};
        g.fillPolygon(pinoBiColor220X,pinoBiColor220Y,pinoBiColor220X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor_21X[] = {1263,1267,1267};
        int pinoBiColor_21Y[] = {470,455,470};
        g.fillPolygon(pinoBiColor_21X,pinoBiColor_21Y,pinoBiColor_21X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor221X[] = {1267,1267,1271};
        int pinoBiColor221Y[] = {470,455,470};
        g.fillPolygon(pinoBiColor221X,pinoBiColor221Y,pinoBiColor221X.length);

        g.setColor(new Color(174,169,189));
        int pinoBiColor_22X[] = {1273,1277,1277};
        int pinoBiColor_22Y[] = {430,415,430};
        g.fillPolygon(pinoBiColor_22X,pinoBiColor_22Y,pinoBiColor_22X.length);
        g.setColor(new Color(63,130,149));
        int pinoBiColor222X[] = {1277,1277,1281};
        int pinoBiColor222Y[] = {430,415,430};
        g.fillPolygon(pinoBiColor222X,pinoBiColor222Y,pinoBiColor222X.length);

        g.setColor(new Color(93,175,152));

        int pino2_1X[] = {106,109,112};
        int pino2_1Y[] = {643,630,643};
        g.fillPolygon(pino2_1X,pino2_1Y,pino2_1X.length);

        int pino2_2X[] = {123,126,129};
        int pino2_2Y[] = {640,627,640};
        g.fillPolygon(pino2_2X,pino2_2Y,pino2_2X.length);

        int pino2_3X[] = {137,140,143};
        int pino2_3Y[] = {646,633,646};
        g.fillPolygon(pino2_3X,pino2_3Y,pino2_3X.length);

        int pino2_4X[] = {160,163,166};
        int pino2_4Y[] = {637,624,637};
        g.fillPolygon(pino2_4X,pino2_4Y,pino2_4X.length);

        int pino2_5X[] = {154,157,160};
        int pino2_5Y[] = {665,652,665};
        g.fillPolygon(pino2_5X,pino2_5Y,pino2_5X.length);

        int pino2_6X[] = {224,227,230};
        int pino2_6Y[] = {637,624,637};
        g.fillPolygon(pino2_6X,pino2_6Y,pino2_6X.length);

        int pino2_7X[] = {188,191,194};
        int pino2_7Y[] = {654,641,654};
        g.fillPolygon(pino2_7X,pino2_7Y,pino2_7X.length);

        int pino2_8X[] = {233,236,239};
        int pino2_8Y[] = {657,644,657};
        g.fillPolygon(pino2_8X,pino2_8Y,pino2_8X.length);

        int pino2_9X[] = {252,255,258};
        int pino2_9Y[] = {651,638,651};
        g.fillPolygon(pino2_9X,pino2_9Y,pino2_9X.length);

        int pino2_10X[] = {286,289,292};
        int pino2_10Y[] = {647,634,647};
        g.fillPolygon(pino2_10X,pino2_10Y,pino2_10X.length);

        int pino2_11X[] = {308,311,314};
        int pino2_11Y[] = {666,653,666};
        g.fillPolygon(pino2_11X,pino2_11Y,pino2_11X.length);

        g.setColor(new Color(82,149,132));

        int pino3_1X[] = {115,118,121};
        int pino3_1Y[] = {648,637,648};
        g.fillPolygon(pino3_1X,pino3_1Y,pino3_1X.length);

        int pino3_2X[] = {130,133,136};
        int pino3_2Y[] = {658,647,658};
        g.fillPolygon(pino3_2X,pino3_2Y,pino3_2X.length);

        int pino3_4X[] = {180,183,186};
        int pino3_4Y[] = {647,636,647};
        g.fillPolygon(pino3_4X,pino3_4Y,pino3_4X.length);

        int pino3_5X[] = {206,209,212};
        int pino3_5Y[] = {633,622,633};
        g.fillPolygon(pino3_5X,pino3_5Y,pino3_5X.length);

        int pino3_6X[] = {215,218,221};
        int pino3_6Y[] = {639,628,639};
        g.fillPolygon(pino3_6X,pino3_6Y,pino3_6X.length);

        int pino3_7X[] = {201,204,207};
        int pino3_7Y[] = {663,652,663};
        g.fillPolygon(pino3_7X,pino3_7Y,pino3_7X.length);

        int pino3_8X[] = {220,223,226};
        int pino3_8Y[] = {655,644,655};
        g.fillPolygon(pino3_8X,pino3_8Y,pino3_8X.length);

        int pino3_9X[] = {248,251,254};
        int pino3_9Y[] = {638,627,638};
        g.fillPolygon(pino3_9X,pino3_9Y,pino3_9X.length);

        int pino3_10X[] = {260,263,266};
        int pino3_10Y[] = {668,656,668};
        g.fillPolygon(pino3_10X,pino3_10Y,pino3_10X.length);

        int pino3_11X[] = {300,303,306};
        int pino3_11Y[] = {660,649,660};
        g.fillPolygon(pino3_11X,pino3_11Y,pino3_11X.length);

        int pino3_12X[] = {270,273,276};
        int pino3_12Y[] = {646,635,646};
        g.fillPolygon(pino3_12X,pino3_12Y,pino3_12X.length);

        int pino3_13X[] = {318,321,324};
        int pino3_13Y[] = {651,640,651};
        g.fillPolygon(pino3_13X,pino3_13Y,pino3_13X.length);

        g.setColor(new Color(55,121,111));

        int pino4_1X[] = {700,703,706};
        int pino4_1Y[] = {672,662,672};
        g.fillPolygon(pino4_1X,pino4_1Y,pino4_1X.length);

        int pino4_2X[] = {700,703,706};
        int pino4_2Y[] = {657,647,657};
        g.fillPolygon(pino4_2X,pino4_2Y,pino4_2X.length);

        int pino4_3X[] = {714,717,720};
        int pino4_3Y[] = {660,650,660};
        g.fillPolygon(pino4_3X,pino4_3Y,pino4_3X.length);

        int pino4_4X[] = {717,720,723};
        int pino4_4Y[] = {684,674,684};
        g.fillPolygon(pino4_4X,pino4_4Y,pino4_4X.length);

        int pino4_5X[] = {732,735,738};
        int pino4_5Y[] = {653,643,653};
        g.fillPolygon(pino4_5X,pino4_5Y,pino4_5X.length);

        int pino4_6X[] = {737,740,743};
        int pino4_6Y[] = {690,680,690};
        g.fillPolygon(pino4_6X,pino4_6Y,pino4_6X.length);

        int pino4_7X[] = {733,736,739};
        int pino4_7Y[] = {666,656,666};
        g.fillPolygon(pino4_7X,pino4_7Y,pino4_7X.length);

        int pino4_8X[] = {764,767,770};
        int pino4_8Y[] = {660,650,660};
        g.fillPolygon(pino4_8X,pino4_8Y,pino4_8X.length);

        int pino4_9X[] = {790,793,796};
        int pino4_9Y[] = {648,638,648};
        g.fillPolygon(pino4_9X,pino4_9Y,pino4_9X.length);

        //NUBES

        Color gradient1 = new Color(255,255,255);
        Color gradient2 = new Color(200,230,200);
        GradientPaint gp = new GradientPaint(250,110,gradient1,245,200,gradient2);
        g2.setPaint(gp);
        int nube1X[] = {13,20,51,83,95,116,153,169,194,223,243,264,299, 316,341,380,398,425,453,
                475,477,468,473,461,439,402,383,350,321, 296,259,243,229,188,162,140,110,92,64,39,26,15};
        int nube1Y[] = {161,135,126,131,138,120,117,123,111,113,127,118,122, 133,118,111,122,115,141,151,
                170,181,197,213,224,219,233,235,220, 234,230,220,233,233,219,225,222,206,210,199,178,174};
        g2.fillPolygon(nube1X,nube1Y,nube1X.length);

        gp = new GradientPaint(170,165,gradient1,170,205,gradient2);
        g2.setPaint(gp);
        int nube2X[] = {550,560,567,579,588,596,606,616,635,646,656,667,682,702,715,718,719,730,
                743,751,755,757,750,742,733,725,718,705,696,681,663,646,629,617,601,582,566,556,
                535,525,511,509,517,522,530};
        int nube2Y[] = {196,186,183,181,190,182,173,170,166,168,177,168,163,164,170,176,184,181,
                183,194,204,218,232,242,245,254,261,262,256,269,274,272,266,261,279,284,283,274,
                273,265,256,238,226,215,203};
        g2.fillPolygon(nube2X,nube2Y,nube2X.length);

        gp = new GradientPaint(170,180,gradient1,170,215,gradient2);
        g2.setPaint(gp);
        int nube3X[] = {779,783,789,797,807,817,824,832,838,844,852,861,875,884,893,905,913,919,927,
                933,941,942,948,954,952,950,946,936,926,916,914,906,891,877,865,853,845,840,833,824,
                813,803,795,789,782,778,777};
        int nube3Y[] = {229,217,211,202,199,200,196,195,195,197,190,185,189,183,179,184,191,189,188,
                192,197,203,201,206,220,234,245,248,246,246,253,258,257,252,260,263,263,258,255,262,
                264,261,256,251,248,243,236};
        g2.fillPolygon(nube3X,nube3Y,nube3X.length);

        gp = new GradientPaint(170,103,gradient1,170,140,gradient2);
        g2.setPaint(gp);
        int nube4X[] = {1123,1136,1148,1159,1168,1177,1188,1197,1205,1215,1227,1232,1240,1250,1259,1271,
                1286,1285,1280,1274,1267,1260,1253,1245,1238,1222,1213,1206,1199,1188,1180,1173,1161,1150,
                1135,1123,1113,1109,1112};
        int nube4Y[] = {132,124,124,130,120,116,115,122,112,109,112,116,110,106,102,107,104,190,190,188,
                185,180,187,190,192,187,183,188,191,189,185,179,186,187,187,179,169,164,142,142};
        g2.fillPolygon(nube4X,nube4Y,nube4X.length);

        //ESTRELLAS

        Color estrella = new Color(174,175,195,90);
        g.setColor(estrella);
        g.fillOval(138,86,4,4);
        g.fillOval(289,35,3,3);
        g.fillOval(317,61,3,3);
        g.fillOval(305,81,4,4);
        g.fillOval(378,86,3,3);
        g.fillOval(557,71,3,3);
        g.fillOval(509,70,4,3);
        g.fillOval(650,63,4,3);
        g.fillOval(823,54,3,3);
        g.fillOval(887,25,3,3);
        g.fillOval(964,47,4,4);
        g.fillOval(1026,73,3,3);
        g.fillOval(1123,80,3,4);
        g.fillOval(1104,146,3,3);
        g.fillOval(820,143,3,3);
        g.fillOval(1245,27,3,3);
    }
}
