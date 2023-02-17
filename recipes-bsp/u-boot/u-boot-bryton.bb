require recipes-bsp/u-boot/u-boot.inc

# Includes files folder and the original u-boot files folder
FILESEXTRAPATHS:prepend := "${THISDIR}/files:${TOPDIR}/../layers/poky/meta/recipes-bsp/u-boot/files:"
HOMEPAGE = "http://www.denx.de/wiki/U-Boot/WebHome"
DESCRIPTION = "U-Boot Bryton is a out-of-tree bootloader for Bryton bike gps"
SECTION = "bootloaders"
DEPENDS += "flex-native bison-native bc-native dtc-native python3-setuptools-native"

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=5a7450c57ffe5ae63fd732446b988025"
PE = "1"

SRC_URI = " \
    git://git@github.com/plambs/u-boot-bryton.git;protocol=https;branch=master-bryton \
    file://0001-riscv32-Use-double-float-ABI-for-rv32.patch \
    file://0001-riscv-fix-build-with-binutils-2.38.patch \
    file://0001-i2c-fix-stack-buffer-overflow-vulnerability-in-i2c-m.patch \
    file://0001-fs-squashfs-sqfs_read-Prevent-arbitrary-code-executi.patch \
    file://0001-net-Check-for-the-minimum-IP-fragmented-datagram-siz.patch \
    file://0001-fs-squashfs-Use-kcalloc-when-relevant.patch \
"
SRCREV = "d637294e264adfeb29f390dfc393106fd4d41b17"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

inherit pkgconfig

do_configure[cleandirs] = "${B}"

