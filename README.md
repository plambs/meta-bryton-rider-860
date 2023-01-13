This README file contains information on the contents of the meta-bryton-rider-860 layer.

Please see the corresponding sections below for details.

Dependencies
============

- poky
- meta-openembedded

Patches
=======

Please submit any patches against the meta-bryton-rider-860 layer using pull request

Quick start
===========

If you want to quickly start to build the core-image-bryton-rider-860 image you can use KAS
```
kas build bryton-rider-860.yml
```

Flashing the Bryton860
======================

To false the device it need to be in [FEL](https://linux-sunxi.org/FEL)
The button method work on the Bryton hardware, the device need to be connected with an USB cable.
```
The following seems to work:

    Press and hold the Start/Stop recording button.
    Press and hold the power key for about 2 seconds.
    Release the power key, and press it at least 3 times immediately.

Boot1 is initialized using this method.
```
After doing that the device will be listed by the **sunxi-fel** tools.
```
$ sudo sunxi-fel version
AWUSBFEX soc=00001667(A33) 00000001 ver=0001 44 08 scratchpad=00007e00 00000000 00000000
```

Running U-Boot
```
sudo sunxi-fel uboot build/tmp/deploy/images/bryton-rider-860/u-boot.bin
```

Flashing U-Boot on emmc
```
TODO
```

Flashing system image using fastboot over USB
```
TODO
```

Porting on Bryton Rider 860 hardware
====================================

Hardware specification:
- SOC: ?
- RAM: ?
- Storage: ?
- Screen: ?
- Battery: ?
- Temperature sensor: ?
- WLAN: ?
- Bluetooth ?
- Altimeter: ?


What work:
- Boot: :X:
- Screen: :X:
- GPS: :X:
- Touchscreen: :X:
- Button: :X:
- Backlight: :X:
- WLAN: :X:
- Bluetooth: :X:
- Altimeter: :X:
- Temperature sensor: :X:
- ANT/ANT+: :X:
- USB: :X:
- Buzzer: :X:
