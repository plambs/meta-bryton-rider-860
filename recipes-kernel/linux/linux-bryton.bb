require recipes-kernel/linux/linux-yocto.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

SRC_URI = "git://git@github.com/plambs/linux-bryton.git;protocol=https;branch=master-bryton;"
SRCREV = "68a95455c153f8adc513e5b688f4b348daa7c1b1"

LINUX_VERSION ?= "6.1.9"
PV = "${LINUX_VERSION}+git${SRCPV}"
