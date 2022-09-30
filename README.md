This README file contains information on the contents of the meta-bryton-rider-860 layer.

Please see the corresponding sections below for details.

Dependencies
============

- poky
- meta-openembedded
- meta-raspberrypi

Patches
=======

Please submit any patches against the meta-bryton-rider-860 layer using pull request

Quick start
===========

If you want to quickly start to build the core-image-bryton-rider-860 image you can use KAS
```
kas build bryton-rider-860.yml
```
Then flash the image on the sdcard
```
cd build/tmp/deploy/images/raspberrypi4-64
sudo bmaptool copy core-image-bryton-rider-860-raspberrypi4-64.wic.bz2 /dev/sdb
```
