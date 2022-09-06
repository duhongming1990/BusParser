# BusParser

parse vehicle bus network descriptions file：*.dbc(CAN总线）、*.ldf(LIN总线)

## 四大汽车总线

CAN总线是中坚，LIN是CAN的副手，FlexRay是未来的希望，MOST则负责文化事业。

|类别|总线名称|描述文件|通信速度|应用范围
|---|---|---|---|---|
A类|LIN|.ldf|10~125K（车身）|大灯、灯光、门锁、电动座椅等
B类|CAN|.dbc|125K~1M|汽车空调、电子指示、故障检查等
C类|FlexRay| |1M-10M|引擎控制、ABS、悬架控制、线控转向等
D类|Most/1394| |10M以上|汽车导航系统、多媒体娱乐等

## 寻找ldf、dbc文件

https://sourcegraph.com/search?q=ldf.g4

https://sourcegraph.com/search?q=dbc.g4

最终发现这个项目：
https://github.com/christoph2/pydbc

https://github.com/PersonalTransport/LIN
