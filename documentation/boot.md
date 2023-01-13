# Normal boot serial output

## Boot0 at 115200bauds
```
HELLO! BOOT0 is starting!
boot0 version : 4.0.0
fel_flag = 0x00000000
rtc[0] value = 0x00000000
rtc[1] value = 0x000000cf
rtc[2] value = 0x00000000
rtc[3] value = 0xf1f18000
DRAM DRIVE INFO: V1.6
DRAM Type =3 (2:DDR2,3:DDR3,6:LPDDR2,7:LPDDR3)
DRAM zq value: 00003bbbDRAM CLK =480 MHZ
USE PLL DDR1
USE PLL NORMAL
PLL FREQUENCE = 960 MHZ
DRAM PLL DDR1 frequency extend open !
�RAM master priority setting ok.
Auto calculate timing parameter!
para_dram_tpr0 = 0046210c
para_dram_tpr1 = 01c2210a
para_dram_tpr2 = 0005403a
tcl = 6,tcwl = 4
DRAM TIMING PARA0 = 0a0c180a
DRAM TIMING PARA1 = 0003040c
DRAM TIMING PARA2 = 0406050a
DRAM TIMING PARA3 = 0000400c
DRAM TIMING PARA4 = 04020404
DRAM TIMING PARA5 = 05050403
DRAM TIMING PARA8 = 90003310
DRAM PHY INTERFACE PARA = 02040102
DRAM VTC is disable
DRAM dynamic DQS/DQ ODT is on
DRAM SIZE AUTO SCAN ENABLE.
NOW,the work mode register value is 004318e5
DRAM DQS gate is open.
DRAM two rank training is on,the value is 93003587
DRAM auto scan size success!
DRAM recovery DQS gate mode 0
DRAM DQS gate is close.
DRAM work mode register value = 004318e5
DRAM SIZE =1024 M
set two rank ODTMAP
DRAM simple test OK.
dram size =1024
card boot number = 2
card no is 2
sdcard 2 line count 4
[mmc]: mmc driver ver 2015-04-13 15:56:39
[mmc]: ***Try SD card 2***
[mmc]: mmc 2 cmd 8 err 00000100
[mmc]: mmc 2 cmd 8 err 00000100
[mmc]: mmc 2 send if cond failed
�m��]: mmc 2 cmd 55 err 00000100
[mmc]: mmc 2 cmd 55 err 00000100
[mmc]: mmc 2 send app cmd failed
[mmc]: ***Try MMC card 2***
[mmc]: mmc re-update_phase
[mmc]: mmc re-update_phase
[mmc]: mmc re-update_phase
[mmc]: MMC ver 4.0
[mmc]: SD/MMC Card: 4bit, capacity: 14976MB
[mmc]: vendor: Man 00700100 Snr 20137d62
[mmc]: product: TB281
[mmc]: revision: 3.6
[mmc]: ***SD/MMC 2 init OK!!!***
sdcard 2 init ok
The size of uboot is 000cc000.
sum=9197d064
src_sum=9197d064
set_mmc_para,sdly 50M 0
set_mmc_pa�a,sdly 25M 0
Succeed in loading uboot from sdmmc flash.
Ready to disable icache.
Jump to secend Boot.
```

## U-Boot serial console at 150000bauds
```
U-Boot 2011.09-rc1-00000-g54ab542-dirty (Feb 19 2021 - 19:22:44) Allwinner Technology

[      0.342]version: 1.1.0
[      0.421]pmbus:   normal or secure os
ready
[      0.424]PMU: AXP221
[      0.426]PMU: AXP22x found
bat_vol=3982, ratio=87
[      0.430]PMU: dcdc3 1200
[      0.433]PMU: pll1 1008 Mhz,PLL6=600 Mhz
AXI=336 Mhz,AHB=200 Mhz, APB1=100 Mhz
set power on vol to default
dcdc1_vol = 3000
dcdc2_vol = 1100
dcdc3_vol = 1200
dcdc4_vol = 0
dcdc5_vol = 1500
aldo2_vol = 2500
aldo3_vol = 3000
eldo1_vol = 1800
find power_sply to end
vbus not exist
only battery exist, limit to dc
fel key old mode
run key detect
no key found
no key input
dram_para_set start
dram_para_set end
[      0.553]DRAM:  1 GiB
relocation Offset is: 35b02000
smcl's set manager is NULL
<axp22, dc1sw>
workmode = 0
MMC:	 2
[      0.602][mmc]: mmc driver ver 2016-03-24 19:30:15
[      0.606][mmc]: get sdc_phy_wipe fail.
[      0.609][mmc]: get sdc0 sdc_erase fail.
[      0.612][mmc]: get sdc_2xmode ok, val = 1
[      0.615][mmc]: get sdc_ddrmode fail  used =  0
[      0.619][mmc]: get sdc_f_max fail,use default  50000000Hz
[      0.623][mmc]: get card_line ok, card_line = 4
[      0.626][mmc]: undefined value 0 or kernel not use auto sample,use default dly
[      0.632][mmc]: SUNXI SD/MMC: 2
[      0.635][mmc]: mmc_config_clock: clk 400000
[      0.650][mmc]: *Try SD card 2*
[      0.654][mmc]: mmc 2 cmd 8 err 100
[      0.659][mmc]: mmc send if cond failed
[      0.663][mmc]: mmc 2 cmd 55 err 100
[      0.668][mmc]: send app cmd failed
[      0.670][mmc]: *Try MMC card 2*
[      0.722][mmc]: mmc_config_clock: clk 25000000
[      0.737][mmc]: mmc re-update_phase
[      0.744][mmc]: mmc re-update_phase
[      0.752][mmc]: mmc re-update_phase
[      0.758][mmc]: mmc re-update_phase
[      0.906][mmc]: mmc_config_clock: clk 25000000
[      0.915][mmc]: mmc_config_clock: clk 50000000
[      0.924][mmc]: CID 0x70010054 0x42323831 0x3620137d 0x620f160d
[      0.928][mmc]: MMC v5.1
[      0.930][mmc]: mmc clk 50000000
[      0.932][mmc]: SD/MMC Card: 4bit, capacity: 14976MB
[      0.936][mmc]: boot0 capacity: 4000KB,boot1 capacity: 4000KB
[      0.941][mmc]: ***SD/MMC 2 init OK!!!***
[      0.951][mmc]: erase_grp_size:0x400WrBlk * 0x200 = 0x80000 Byte
[      0.956][mmc]: secure_feature 0x55
[      0.958][mmc]: secure_removal_type  0x1
[      0.962]sunxi flash init ok
out of usb burn from boot: without usb
In:    serial
Out:   serial
Err:   serial
--------fastboot partitions--------
-total partitions:14-
-name-        -start-       -size-
bootloader  : 1000000       2000000
env         : 3000000       1000000
boot        : 4000000       1000000
system      : 5000000       80000000
misc        : 85000000      1000000
recovery    : 86000000      2000000
cache       : 88000000      30000000
metadata    : b8000000      1000000
private     : b9000000      1000000
frp         : ba000000      80000
empty       : ba080000      f80000
alog        : bb000000      5000000
media_data  : c0000000      1000000
UDISK       : c1000000      0
-----------------------------------
base bootcmd=run setargs_nand boot_normal
bootcmd set setargs_mmc
key 0
recovery key high 18, low 16
cant find fstbt value
misc partition found
to be run cmd=run setargs_mmc boot_normal
[      1.088][mmc]: blkcnt should not be 0
[      1.090][mmc]: blkcnt should not be 0
serial is: 1804200400003688
mount part name bootloader
cant open script.bin, maybe it is not exist
WORK_MODE_BOOT
board_status_probe
[      1.126]key trigger
sunxi_bmp_logo_display
screen_id =0, screen_width =240, screen_height =400
[      1.194]Hit any key to stop autoboot:  0
read boot or recovery all
[      1.842]sunxi flash read :offset 4000000, 15012262 bytes OK
no signature
[      1.853]ready to boot
para err in disp_ioctl, cmd = 0xa,screen id = 1
[      1.858][mmc]: mmc exit start
[      1.861][mmc]: mmc_config_clock: clk 50000000
[      1.871][mmc]: mmc_config_clock: clk 400000
[      1.887][mmc]: mmc 2 cmd 8 err 100
[      1.892][mmc]: mmc send if cond failed
[      1.896][mmc]: mmc 2 cmd 55 err 100
[      1.901][mmc]: send app cmd failed
[      1.914][mmc]: get sdc_phy_wipe fail.
[      1.917][mmc]: get sdc0 sdc_erase fail.
[      1.920][mmc]: get sdc_2xmode ok, val = 1
[      1.923][mmc]: get sdc_ddrmode fail  used =  0
[      1.926][mmc]: get sdc_f_max fail,use default  50000000Hz
[      1.931][mmc]: get card_line ok, card_line = 4
[      1.934][mmc]: undefined value 0 or kernel not use auto sample,use default dly
[      1.940][mmc]: mmc 2 exit ok
[      1.942]
Starting kernel ...
```

## Android boot at 115200bauds
```
[    0.000000] Booting Linux on physical CPU 0
[    0.000000] Initializing cgroup subsys cpuset
[    0.000000] Initializing cgroup subsys cpu
[    0.000000] Linux version 3.4.39 (root@bryton-rider) (gcc version 4.6.3 20120201 (prerelease) (crosstool-NG linaro-1.13.1-2012.02-20120222 - Linaro GCC 2012.02) ) #147 SMP PREEMPT Fri Feb 19 19:27:25 CST 2021
[    0.000000] CPU: ARMv7 Processor [410fc075] revision 5 (ARMv7), cr=10c5387d
[    0.000000] CPU: PIPT / VIPT nonaliasing data cache, VIPT aliasing instruction cache
[    0.000000] Machine: sun8i
[    0.000000] Initialized persistent memory from 43080800-430907ff
[    0.000000] cma: CMA: reserved 256 MiB at 70000000
[    0.000000] Memory policy: ECC disabled, Data cache writealloc
[    0.000000] On node 0 totalpages: 262144
[    0.000000] free_area_init_node: node 0, pgdat c0945e00, node_mem_map c1403000
[    0.000000]   Normal zone: 1710 pages used for memmap
[    0.000000]   Normal zone: 0 pages reserved
[    0.000000]   Normal zone: 192850 pages, LIFO batch:31
[    0.000000]   HighMem zone: 594 pages used for memmap
[    0.000000]   HighMem zone: 66990 pages, LIFO batch:15
[    0.000000] script_init enter!
[    0.000000] script_init exit!
[    0.000000] PERCPU: Embedded 8 pages/cpu @c1d1c000 s10688 r8192 d13888 u32768
[    0.000000] pcpu-alloc: s10688 r8192 d13888 u32768 alloc=8*4096
[    0.000000] pcpu-alloc: [0] 0 [0] 1 [0] 2 [0] 3 
[    0.000000] Built 1 zonelists in Zone order, mobility grouping on.  Total pages: 259840
[    0.000000] Kernel command line: boot_type=2 disp_para=100 fb_base=0x0 config_size=42776 androidboot.serialno=1804200400003688 androidboot.hardware=sun8i console=ttyS0,115200 root=/dev/mmcblk0p7 init=/init ion_cma_list=120m,256m loglevel=8 partitions=bootloader@mmcblk0p2:env@mmcblk0p5:boot@mmcblk0p6:system@mmcblk0p7:misc@mmcblk0p8:recovery@mmcblk0p9:cache@mmcblk0p10:metadata@mmcblk0p11:private@mmcblk0p12:frp@mmcblk0p13:empty@mmcblk0p14:alog@mmcblk0p15:media_data@mmcblk0p16:UDISK@mmcblk0p1
[    0.000000] PID hash table entries: 4096 (order: 2, 16384 bytes)
[    0.000000] Dentry cache hash table entries: 131072 (order: 7, 524288 bytes)
[    0.000000] Inode-cache hash table entries: 65536 (order: 6, 262144 bytes)
[    0.000000] Memory: 1024MB = 1024MB total
[    0.000000] Memory: 760852k/760852k available, 287724k reserved, 8192K highmem
[    0.000000] Virtual kernel memory layout:
[    0.000000]     vector  : 0xffff0000 - 0xffff1000   (   4 kB)
[    0.000000]     fixmap  : 0xfff00000 - 0xfffe0000   ( 896 kB)
[    0.000000]     vmalloc : 0xf0000000 - 0xff000000   ( 240 MB)
[    0.000000]     lowmem  : 0xc0000000 - 0xef800000   ( 760 MB)
[    0.000000]     pkmap   : 0xbfe00000 - 0xc0000000   (   2 MB)
[    0.000000]     modules : 0xbf000000 - 0xbfe00000   (  14 MB)
[    0.000000]       .text : 0xc0008000 - 0xc08842a0   (8689 kB)
[    0.000000]       .init : 0xc0885000 - 0xc08d49c0   ( 319 kB)
[    0.000000]       .data : 0xc08d6000 - 0xc0955b90   ( 511 kB)
[    0.000000]        .bss : 0xc0956a20 - 0xc0add800   (1564 kB)
[    0.000000] Preemptible hierarchical RCU implementation.
[    0.000000] NR_IRQS:416
[    0.000000] Architected local timer running at 24.00MHz.
[    0.000000] Switching to timer-based delay loop
[    0.000000] sched_clock: 32 bits at 24MHz, resolution 41ns, wraps every 178956ms
[    0.000000] Console: colour dummy device 80x30
[    0.000258] Calibrating delay loop (skipped), value calculated using timer frequency.. 4800.00 BogoMIPS (lpj=24000000)
[    0.000284] pid_max: default: 32768 minimum: 301
[    0.000503] Security Framework initialized
[    0.000556] SELinux:  Initializing.
[    0.000668] SELinux:  Starting in permissive mode
[    0.000773] Mount-cache hash table entries: 512
[    0.001935] Initializing cgroup subsys debug
[    0.001953] Initializing cgroup subsys cpuacct
[    0.001965] Initializing cgroup subsys freezer
[    0.002014] CPU: Testing write buffer coherency: ok
[    0.002079] ftrace: allocating 22535 entries in 67 pages
[    0.030317] CPU0: thread -1, cpu 0, socket 0, mpidr 80000000
[    0.030337] [sunxi_smp_prepare_cpus] enter
[    0.030384] Setting up static identity map for 0x405ed588 - 0x405ed5e0
[    0.010000] CPU1: Booted secondary processor
[    0.010000] CPU1: thread -1, cpu 1, socket 0, mpidr 80000001
[    0.010000] CPU2: Booted secondary processor
[    0.010000] CPU2: thread -1, cpu 2, socket 0, mpidr 80000002
[    0.010000] CPU3: Booted secondary processor
[    0.010000] CPU3: thread -1, cpu 3, socket 0, mpidr 80000003
[    0.210184] Brought up 4 CPUs
[    0.210184] SMP: Total of 4 processors activated (19200.00 BogoMIPS).
[    0.210463] devtmpfs: initialized
[    0.214446] VFP support v0.3: implementor 41 architecture 2 part 30 variant 7 rev 5
[    0.220124] pinctrl core: initialized pinctrl subsystem
[    0.231158] NET: Registered protocol family 16
[    0.252459] DMA: preallocated 2048 KiB pool for atomic coherent allocations
[    0.252544] script_sysfs_init success
[    0.252578] sunxi_dump_init success
[    0.253711] gpiochip_add: registered GPIOs 0 to 383 on device: sunxi-pinctrl
[    0.255153] sunxi-pinctrl sunxi-pinctrl: initialized sunXi PIO driver
[    0.255571] gpiochip_add: registered GPIOs 1024 to 1031 on device: axp-pinctrl
[    0.256890] persistent_ram: uncorrectable error in header
[    0.256905] persistent_ram: no valid data in buffer (sig = 0xffffffff)
[    0.267535] console [ram-1] enabled
[    0.268360] [sunxi-module]: [sunxi-module.0] probe success
[    0.268499] script config pll3 to 297 Mhz
[    0.268686] script config pll4 to 300 Mhz
[    0.268814] script config pll6 to 600 Mhz
[    0.268918] script config pll8 to 408 Mhz
[    0.269109] script config pll9 to 480 Mhz
[    0.269212] script config pll10 to 297 Mhz
[    0.269388] sunxi_default_clk_init
[    0.269486] try to set pll6ahb1 to 200000000
[    0.269627] try to set ahb clk source to pll6ahb1
[    0.269805] set ahb clk source to pll6ahb1
[    0.269905] try to set ahb1 to 200000000
[    0.270000] try to set apb1 to 100000000
[    0.280304] bio: create slab <bio-0> at 0
[    0.280649] [ARISC] :sunxi-arisc driver v1.60
[    0.325669] [ARISC] :arisc version: [v0.1.11]
[    0.325874] [sunxi-module]: arisc register success
[    0.543879] [ARISC] :sunxi-arisc driver v1.60 startup succeeded
[    0.545574] usbcore: registered new interface driver usbfs
[    0.545574] usbcore: registered new interface driver hub
[    0.550045] usbcore: registered new device driver usb
[    0.550259] twi_chan_cfg()335 - [twi0] has no twi_regulator.
[    0.550442] twi_chan_cfg()335 - [twi1] has no twi_regulator.
[    0.550545] twi_chan_cfg()335 - [twi2] has no twi_regulator.
[    0.551724] Linux video capture interface: v2.00
[    0.560426] current_limit = 500000
[    0.560735] Advanced Linux Sound Architecture Driver Version 1.0.25.
[    0.561335] cfg80211: Calling CRDA to update world regulatory domain
[    0.561492] Switching to clocksource arch_sys_counter
[    0.582785] FS-Cache: Loaded
[    0.583240] CacheFiles: Loaded
[    0.596340] NET: Registered protocol family 2
[    0.596832] IP route cache hash table entries: 32768 (order: 5, 131072 bytes)
[    0.597663] TCP established hash table entries: 131072 (order: 8, 1048576 bytes)
[    0.599733] TCP bind hash table entries: 65536 (order: 7, 786432 bytes)
[    0.600896] TCP: Hash tables configured (established 131072 bind 65536)
[    0.601001] TCP: reno registered
[    0.601185] UDP hash table entries: 512 (order: 2, 16384 bytes)
[    0.601314] UDP-Lite hash table entries: 512 (order: 2, 16384 bytes)
[    0.601860] NET: Registered protocol family 1
[    0.602436] RPC: Registered named UNIX socket transport module.
[    0.602621] RPC: Registered udp transport module.
[    0.602720] RPC: Registered tcp transport module.
[    0.602820] RPC: Registered tcp NFSv4.1 backchannel transport module.
[    0.603276] Unpacking initramfs...
[    0.888581] Freeing initrd memory: 4104K
[    0.890137] [pm]aw_pm_init!
[    0.890248] standby_mode = 1. 
[    0.890348] wakeup src cnt is : 2. 
[    0.890452] [exstandby]leave extended_standby_enable_wakeup_src : event 0x800000
[    0.890634] [exstandby]leave extended_standby_enable_wakeup_src : wakeup_gpio_map 0x80
[    0.890815] [exstandby]leave extended_standby_enable_wakeup_src : wakeup_gpio_group 0x0
[    0.890918] [exstandby]leave extended_standby_enable_wakeup_src : event 0x800000
[    0.891099] [exstandby]leave extended_standby_enable_wakeup_src : wakeup_gpio_map 0x280
[    0.891280] [exstandby]leave extended_standby_enable_wakeup_src : wakeup_gpio_group 0x0
[    0.891502] sunxi_reg_init enter
[    0.892639] audit: initializing netlink socket (disabled)
[    0.892807] type=2000 audit(0.890:1): initialized
[    0.896501] highmem bounce pool size: 64 pages
[    0.898837] NTFS driver 2.1.30 [Flags: R/W].
[    0.899141] fuse init (API version 7.18)
[    0.899877] msgmni has been set to 1478
[    0.900065] SELinux:  Registering netfilter hooks
[    0.902532] Block layer SCSI generic (bsg) driver version 0.4 loaded (major 253)
[    0.902646] io scheduler noop registered
[    0.902827] io scheduler deadline registered
[    0.903019] io scheduler cfq registered (default)
[    0.903619] pwm module init!
[    0.904404] sw_uart_get_devinfo()1503 - uart0 has no uart_regulator.
[    0.904513] sw_uart_get_devinfo()1503 - uart1 has no uart_regulator.
[    0.904698] sw_uart_get_devinfo()1503 - uart2 has no uart_regulator.
[    0.904805] sw_uart_get_devinfo()1473 - get uart3's usedcfg failed
[    0.905542] uart0: ttyS0 at MMIO 0x1c28000 (irq = 32) is a SUNXI
[    0.905649] sw_uart_pm()890 - uart0 clk is already enable
[    0.905840] sw_console_setup()1233 - console setup baud 115200 parity n bits 8, flow n
[    1.001453] console [ttyS0] enabled
[    1.197540] uart1: ttyS1 at MMIO 0x1c28400 (irq = 33) is a SUNXI
[    1.295261] uart2: ttyS2 at MMIO 0x1c28800 (irq = 34) is a SUNXI
[    1.397785] loop: module loaded
[    1.495179] [rf_pm]: select module num is 2
[    1.592351] [rf_pm]: module power1 name axp22_dldo1
[    1.787179] [rf_pm]: module power1 vol 3000000
[    1.917371] [rf_pm]: module power2 name axp22_eldo1
[    1.922861] [rf_pm]: module power2 vol 3000000
[    1.927942] [rf_pm]: module power3 name axp22_dldo2
[    1.933436] [rf_pm]: module power3 vol 3300000
[    1.938434] [rf_pm]: module power3 name axp22_dldo3
[    1.944004] [rf_pm]: module power4 vol 3000000
[    1.949005] [rf_pm]: mod has no power_switch gpio
[    1.954386] [rf_pm]: mod has no chip_en gpio
[    1.959196] [rf_pm]: lpo_use_apclk: losc_out
[    1.964209] [rf_pm]: set axp22_dldo1 to 3000000 v
[    1.969732] [rf_pm]: enable axp22_dldo1.
[    1.974753] [rf_pm]: set axp22_eldo1 to 3000000 v
[    1.980239] [rf_pm]: enable axp22_eldo1.
[    1.984768] [rf_pm]: set axp22_dldo2 to 3300000 v
[    1.990180] [rf_pm]: enable axp22_dldo2.
[    1.995235] [rf_pm]: set axp22_dldo3 to 3000000 v
[    2.000638] [rf_pm]: enable axp22_dldo3.
[    2.005615] [rf_pm]: mod info power switch -1
[    2.010793] [rf_pm]: set losc_out 32k out
[    2.015319] scene_lock_init name=rf_pm
[    2.019882] [wifi_pm]: wifi gpio init is OK !!
[    2.025026] [rfkill]: init no bt used in configuration
[    2.030816] sunxi_spi_chan_cfg()1355 - [spi-0] has no spi_regulator.
[    2.038037] tun: Universal TUN/TAP device driver, 1.6
[    2.043870] tun: (C) 1999-2004 Max Krasnyansky <maxk@qualcomm.com>
[    2.051128] PPP generic driver version 2.4.2
[    2.056112] PPP BSD Compression module registered
[    2.061513] PPP Deflate Compression module registered
[    2.068158] PPP MPPE Compression module registered
[    2.073661] NET: Registered protocol family 24
[    2.078711] PPTP driver version 0.8.5
[    2.083122] ehci_hcd: USB 2.0 'Enhanced' Host Controller (EHCI) Driver
[    2.110683] sunxi-ehci sunxi-ehci.1: SW USB2.0 'Enhanced' Host Controller (EHCI) Driver
[    2.119736] sunxi-ehci sunxi-ehci.1: new USB bus registered, assigned bus number 1
[    2.129454] sunxi-ehci sunxi-ehci.1: irq 104, io mem 0xf1c1a000
[    2.150050] sunxi-ehci sunxi-ehci.1: USB 0.0 started, EHCI 1.00
[    2.157459] hub 1-0:1.0: USB hub found
[    2.161829] hub 1-0:1.0: 1 port detected
[    2.166692] ohci_hcd: USB 1.1 'Open' Host Controller (OHCI) Driver
[    2.193727] sunxi-ohci sunxi-ohci.1: SW USB2.0 'Open' Host Controller (OHCI) Driver
[    2.202398] sunxi-ohci sunxi-ohci.1: new USB bus registered, assigned bus number 2
[    2.210992] sunxi-ohci sunxi-ohci.1: irq 105, io mem 0xf1c1a400
[    2.274611] hub 2-0:1.0: USB hub found
[    2.278946] hub 2-0:1.0: 1 port detected
[    2.283939] usbcore: registered new interface driver usbserial
[    2.290559] usbserial: USB Serial Driver core
[    2.295514] usbcore: registered new interface driver option
[    2.301794] USB Serial support registered for GSM modem (1-port)
[    2.309049] file system registered
[    2.314823] android_usb gadget: Mass Storage Function, version: 2009/09/11
[    2.322627] android_usb gadget: Number of LUNs=3
[    2.327825]  lun0: LUN: removable file: (no medium)
[    2.333407]  lun1: LUN: removable file: (no medium)
[    2.338894]  lun2: LUN: removable file: (no medium)
[    2.344849] get usb_serial_number success from boot command line
[    2.351430] android_usb gadget: android_usb ready
[    2.357490] mousedev: PS/2 mouse device common for all mice
[    2.364757] sunxi-rtc sunxi-rtc: rtc core: registered sunxi-rtc as rtc0
[    2.372412] sunxi cedar version 0.1 
[    2.376507] [cedar]: install start!!!
[    2.380941] [cedar]: install end!!!
[    2.389651] device-mapper: ioctl: 4.22.0-ioctl (2011-10-19) initialised: dm-devel@redhat.com
[    2.399541] axp22_dcdc3: Failed to create debugfs directory
[    2.408330] [mmc]: SD/MMC/SDIO Host Controller Driver(v1.122 2016-09-21 09:48) Compiled in Feb 19 2021 at 19:26:12
[    2.419941] [mmc]: get mmc1's sdc_power failed
[    2.424953] [mmc]: get mmc2's sdc_power failed
[    2.429932] [mmc]: get mmc2's 2xmode ok, val = 1
[    2.435187] [mmc]: MMC host used card: 0x6, boot card: 0x4, io_card 2
[    2.443363] [mmc]: sdc2 set ios: clk 0Hz bm OD pm OFF vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.454337] [mmc]: sdc2 set ios: clk 0Hz bm PP pm UP vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.464433] [mmc]: sdc1 set ios: clk 0Hz bm OD pm OFF vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.465652] [mmc]: sdc2 power_supply is null
[    2.480044] [mmc]: sdc2 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.482581] usbcore: registered new interface driver usbhid
[    2.482588] usbhid: USB HID core driver
[    2.482597] zram: num_devices not specified. Using default: 1
[    2.482603] zram: Creating 1 devices ...
[    2.511954] ashmem: initialized
[    2.515656] logger: created 256K log 'log_main'
[    2.520881] logger: created 256K log 'log_events'
[    2.526343] logger: created 256K log 'log_radio'
[    2.530871] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 52,  RTO !!
[    2.531733] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 52,  RTO !!
[    2.531764] [mmc]: sdc2 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.534265] [mmc]: sdc2 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.536183] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 8,  RTO !!
[    2.536209] *******************Try sdio*******************
[    2.537038] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 5,  RTO !!
[    2.537064] mmc0: req failed (CMD5): -110, retrying...
[    2.537893] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 5,  RTO !!
[    2.537919] mmc0: req failed (CMD5): -110, retrying...
[    2.538745] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 5,  RTO !!
[    2.538771] mmc0: req failed (CMD5): -110, retrying...
[    2.539598] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 5,  RTO !!
[    2.539623] *******************Try sd *******************
[    2.540453] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 55,  RTO !!
[    2.541301] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 55,  RTO !!
[    2.542148] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 55,  RTO !!
[    2.542993] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 55,  RTO !!
[    2.543019] *******************Try mmc*******************
[    2.543031] [mmc]: sdc2 set ios: clk 400000Hz bm OD pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.543469] [mmc]: sdc2 set ios: clk 400000Hz bm OD pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.543569] [mmc]: sdc2 set ios: clk 400000Hz bm OD pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.543669] [mmc]: sdc2 set ios: clk 400000Hz bm OD pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.546163] [mmc]: sdc2 set ios: clk 400000Hz bm OD pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.561274] [mmc]: sdc2 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.575221] [mmc]: sdc2 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.575670] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.575777] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.575873] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.575968] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.576062] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.576150] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.576237] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.576324] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.576412] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.576479] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.576571] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.576659] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.576746] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.576832] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.576920] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.577008] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.577095] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.577181] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.577268] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.579391] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.579487] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.579581] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.579674] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.579767] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.579865] mmc0: new high speed MMC card at address 0001
[    2.580342] mmcblk0: mmc0:0001 TB2816 14.6 GiB 
[    2.580535] mmcblk0boot0: mmc0:0001 TB2816 partition 1 4.00 MiB
[    2.580725] mmcblk0boot1: mmc0:0001 TB2816 partition 2 4.00 MiB
[    2.582622]  mmcblk0: p1 p2 p3 < p5 p6 p7 p8 p9 p10 p11 p12 p13 p14 p15 p16 >
[    2.582672] mmcblk0: p1 size 24403968 extends beyond EOD, truncated
[    2.586161] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.586270] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.586379] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.586476] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.586570] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.587949]  mmcblk0boot1: unknown partition table
[    2.588595] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.588701] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.588796] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.589745]  mmcblk0boot0: unknown partition table
[    2.589956] *******************mmc init ok *******************
[    2.637017] logger: created 256K log 'log_system'
[    3.144071] Linux telephony interface: v1.00
[    3.148990] sunxi_oops: heming add OOPS_INFO_ADDR = -20
[    3.154933] Initializing buzzer device .
[    3.159384] axp22_dldo4: Failed to create debugfs directory
[    3.165758] BYTRON_Buzzer_request pwm 1 success!
[    3.171060] BYTRON_Buzzer_Set_Polarity pwm 1, active low
[    3.177003] BYTRON_Buzzer_Config pwm 1, <128 / 166667> 
[    3.183107] buzzer_create_proc.
[    3.186692] Succedded to initialize buzzer device.
[    3.193412] [ audio ] err:try to get audio_pa_ctrl failed!
[    3.199628] sunxi-pcm-codec: probe of sunxi-pcm-codec failed with error -14
[    3.208599] [I2S0]sunxi-i2s0 cannot find any using configuration for controllers, return directly!
[    3.218803] [I2S]sndi2s0 cannot find any using configuration for controllers, return directly!
[    3.228471] [I2S0] driver not init,just return.
[    3.233563] [I2S1]sunxi-i2s1 cannot find any using configuration for controllers, return directly!
[    3.243799] [I2S]sndi2s1 cannot find any using configuration for controllers, return directly!
[    3.253473] I2S1 driver not init,just return.
[    3.258545] u32 classifier
[    3.261699]     Actions configured
[    3.265532] Netfilter messages via NETLINK v0.30.
[    3.270909] nf_conntrack version 0.5.0 (16048 buckets, 64192 max)
[    3.278269] ctnetlink v0.93: registering with nfnetlink.
[    3.284288] NF_TPROXY: Transparent proxy support initialized, version 4.1.0
[    3.292137] NF_TPROXY: Copyright (c) 2006-2007 BalaBit IT Ltd.
[    3.299109] xt_time: kernel timezone is -0000
[    3.304188] IPv4 over IPv4 tunneling driver
[    3.309370] gre: GRE over IPv4 demultiplexor driver
[    3.314933] ip_gre: GRE over IPv4 tunneling driver
[    3.320953] ip_tables: (C) 2000-2006 Netfilter Core Team
[    3.327158] arp_tables: (C) 2002 David S. Miller
[    3.332425] TCP: cubic registered
[    3.336159] Initializing XFRM netlink socket
[    3.341351] NET: Registered protocol family 10
[    3.347499] Mobile IPv6
[    3.350345] ip6_tables: (C) 2000-2006 Netfilter Core Team
[    3.356635] IPv6 over IPv4 tunneling driver
[    3.362425] NET: Registered protocol family 17
[    3.367438] NET: Registered protocol family 15
[    3.372556] L2TP core driver, V2.0
[    3.376396] PPPoL2TP kernel driver, V2.0
[    3.380888] L2TP IP encapsulation support (L2TPv3)
[    3.386308] L2TP netlink interface
[    3.390189] L2TP ethernet pseudowire support (L2TPv3)
[    3.396243] ThumbEE CPU extension supported.
[    3.401065] Registering SWP/SWPB emulation handler
[    3.408066] otg_wakelock_init: No USB transceiver found
[    3.414022] ****************************************************************
[    3.421972] =====ctp_fetch_sysconfig_para=====. 
[    3.427154] ctp_fetch_sysconfig_para: ctp_power_io script_get_item err. 
[    3.434716] ctp_irq gpio number is 357
[    3.438945] axp22_ldoio1: Failed to create debugfs directory
[    3.460098] it7259_detect: addr= 46
[    3.464213] -------it7259_ts_probe---in------!
[    3.481412] it7259 0-0046: it7259_ts_chip_identify read id: 0A ITE7259 20
[    3.692638] it7259 0-0046: Current fw{3.2.4.5} cfg{E.A7.7.F}
[    3.699023] Execute Upgrade_FW_CFG()
[    3.703116] open /system/etc/firmware/it7259.fw failed 
[    3.709031] it7259 0-0046: failed to upgrade firmware
[    3.750104] i2c 0-0046: Driver it7259 requests probe deferral
[    3.756607] ****************************************************************
[    3.764585] sunxi-rtc sunxi-rtc: setting system clock to 1970-01-10 04:45:28 UTC (794728)
[    3.773736] ths_fetch_sysconfig_para: type err  device_used = 1. 
[    3.780629] ths_fetch_sysconfig_para: type err ths_trip1_3 = 110. 
[    3.787527] ths_fetch_sysconfig_para: type err ths_trip1_4 = 110. 
[    3.794508] ths_fetch_sysconfig_para: type err ths_trip1_5 = 110. 
[    3.801419] ths_fetch_sysconfig_para: type err ths_trip1_6 = 110. 
[    3.808386] ths_fetch_sysconfig_para: type err ths_trip1_7 = 110. 
[    3.815373] ths_fetch_sysconfig_para: type err ths_trip1_3_min = 0. 
[    3.822473] ths_fetch_sysconfig_para: type err ths_trip1_3_max = 0. 
[    3.829633] ths_fetch_sysconfig_para: type err ths_trip1_4_min = 0. 
[    3.836735] ths_fetch_sysconfig_para: type err ths_trip1_4_max = 0. 
[    3.843905] ths_fetch_sysconfig_para: type err ths_trip1_5_min = 0. 
[    3.851007] ths_fetch_sysconfig_para: type err ths_trip1_5_max = 0. 
[    3.858166] ths_fetch_sysconfig_para: type err ths_trip1_6_min = 0. 
[    3.865268] ths_fetch_sysconfig_para: type err ths_trip1_6_max = 0. 
[    3.872438] ths_fetch_sysconfig_para: type err ths_trip2_count = 0. 
[    3.879597] ths_fetch_sysconfig_para: type err ths_trip2_0 = 0. 
[    3.886924] sunxi_cpu_budget_vftable_init: support only one vf_table
[    3.894577] CPU Budget:Register notifier
[    3.898987] CPU Budget:register Success
[    3.903325] sunxi-budget-cooling sunxi-budget-cooling: Cooling device registered: thermal-budget-0
[    3.913434] -------it7259_ts_probe---in------!
[    3.917557] =========GPS========= :gsp not used in configuration
[    3.917571] ALSA device list:
[    3.917576]   No soundcards found.
[    3.932929] Freeing init memory: 316K
[    3.939867] init: init started!
[    3.949605] SELinux: 2048 avtab hash slots, 5121 rules.
[    3.951558] it7259 0-0046: it7259_ts_chip_identify read id: 0A ITE7259 20
[    3.963411] SELinux:  Android master kernel running Android M policy in compatibility mode.
[    3.975834] SELinux: 2048 avtab hash slots, 5121 rules.
[    3.981764] SELinux:  1 users, 2 roles, 544 types, 0 bools, 1 sens, 1024 cats
[    3.989883] SELinux:  87 classes, 5121 rules
[    3.997267] SELinux:  Completing initialization.
[    4.002485] SELinux:  Setting up existing superblocks.
[    4.008267] SELinux: initialized (dev sysfs, type sysfs), uses genfs_contexts
[    4.016341] SELinux: initialized (dev rootfs, type rootfs), uses genfs_contexts
[    4.024657] SELinux: initialized (dev bdev, type bdev), not configured for labeling
[    4.033222] SELinux: initialized (dev proc, type proc), uses genfs_contexts
[    4.041089] SELinux: initialized (dev tmpfs, type tmpfs), uses transition SIDs
[    4.049234] SELinux: initialized (dev devtmpfs, type devtmpfs), uses transition SIDs
[    4.058530] SELinux: initialized (dev debugfs, type debugfs), uses genfs_contexts
[    4.083555] SELinux: initialized (dev sockfs, type sockfs), uses task SIDs
[    4.091360] SELinux: initialized (dev pipefs, type pipefs), uses task SIDs
[    4.099040] SELinux: initialized (dev anon_inodefs, type anon_inodefs), not configured for labeling
[    4.109201] SELinux: initialized (dev devpts, type devpts), uses transition SIDs
[    4.117560] SELinux: initialized (dev selinuxfs, type selinuxfs), uses genfs_contexts
[    4.126380] SELinux: initialized (dev tmpfs, type tmpfs), uses transition SIDs
[    4.134554] SELinux: initialized (dev sysfs, type sysfs), uses genfs_contexts
[    4.162683] it7259 0-0046: Current fw{3.2.4.5} cfg{E.A7.7.F}
[    4.169066] Execute Upgrade_FW_CFG()
[    4.173201] open /system/etc/firmware/it7259.fw failed 
[    4.179117] it7259 0-0046: failed to upgrade firmware
[    4.220113] i2c 0-0046: Driver it7259 requests probe deferral
[    4.328203] type=1403 audit(794729.050:2): policy loaded auid=4294967295 ses=4294967295
[    4.337869] init: (Initializing SELinux non-enforcing took 0.39s.)
[    4.354158] init: init second stage started!
[    4.400675] init: waitpid failed: No child processes
[    4.406787] init: (Loading properties from /default.prop took 0.00s.)
[    4.416637] init: (Parsing /init.environ.rc took 0.00s.)
[    4.423101] init: (Parsing /init.usb.rc took 0.00s.)
[    4.429646] init: (Parsing init.sensors.rc took 0.00s.)
[    4.435622] init: (Parsing init.common.rc took 0.01s.)
[    4.441514] init: (Parsing init.sun8i.common.rc took 0.00s.)
[    4.448017] init: (Parsing init.sun8i.usb.rc took 0.00s.)
[    4.454089] init: (Parsing /init.sun8i.rc took 0.03s.)
[    4.460497] init: (Parsing /init.usb.configfs.rc took 0.00s.)
[    4.467031] init: (Parsing /init.zygote32.rc took 0.00s.)
[    4.473313] init: (Parsing /init.trace.rc took 0.00s.)
[    4.479077] init: (Parsing /init.rc took 0.06s.)
[    4.484567] init: SELinux: Could not get canonical path /adb_keys restorecon: No such file or directory.
[    4.495231] init: Starting service 'ueventd'...
[    4.501205] init: Waiting for /dev/.coldboot_done...
[    4.504237] ueventd: ueventd started!
[    4.610043] WRN:L2847(drivers/usb/sunxi_usb/udc/sunxi_udc.c):pdev is null
[    4.967448] ueventd: Coldboot took 0.46s.
[    4.975498] init: Waiting for /dev/.coldboot_done took 0.47s.
[    4.982041] init: /dev/hw_random not found
[    5.090218] SELinux: initialized (dev cgroup, type cgroup), uses genfs_contexts
[    5.099046] SELinux: initialized (dev tmpfs, type tmpfs), uses transition SIDs
[    5.109208] SELinux: initialized (dev tmpfs, type tmpfs), uses transition SIDs
[    5.121203] init: write_file: Unable to open '/proc/sys/kernel/hung_task_timeout_secs': No such file or directory
[    5.132878] init: write_file: Unable to open '/proc/sys/kernel/sched_tunable_scaling': No such file or directory
[    5.144326] init: write_file: Unable to open '/proc/sys/kernel/sched_latency_ns': No such file or directory
[    5.155286] init: write_file: Unable to open '/proc/sys/kernel/sched_wakeup_granularity_ns': No such file or directory
[    5.167299] init: write_file: Unable to open '/proc/sys/kernel/sched_compat_yield': No such file or directory
[    5.250160] SELinux: initialized (dev cgroup, type cgroup), uses genfs_contexts
[    5.258559] init: write_file: Unable to write to '/dev/cpuctl/cpu.shares': Invalid argument
[    5.370201] SELinux: initialized (dev cgroup, type cgroup), uses genfs_contexts
[    5.381606] init: write_file: Unable to open '/proc/sys/abi/swp': No such file or directory
[    5.392087] SELinux: initialized (dev tmpfs, type tmpfs), uses transition SIDs
[    5.400595] init: /dev/hw_random not found
[    5.437891] [NAND]nand init start, nand0_used_flag is 0
[    5.443799] [NAND]nand driver is disabled 
[    5.451286] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    5.472132] EXT4-fs (mmcblk0p7): mounted filesystem with ordered data mode. Opts: barrier=1
[    5.481580] SELinux: initialized (dev mmcblk0p7, type ext4), uses xattr
[    5.489233] fs_mgr: __mount(source=/dev/block/by-name/system,target=/system,type=ext4)=0
[    5.613777] EXT4-fs (mmcblk0p10): mounted filesystem with ordered data mode. Opts: nomblk_io_submit,errors=remount-ro
[    5.625705] SELinux: initialized (dev mmcblk0p10, type ext4), uses xattr
[    5.633410] fs_mgr: check_fs(): mount(/dev/block/by-name/cache,/cache,ext4)=0: Success
[    5.720082] fs_mgr: check_fs(): unmount(/cache) succeeded
[    5.727772] fs_mgr: Running /system/bin/e2fsck on /dev/block/by-name/cache
[    5.862529] e2fsck: e2fsck 1.42.9 (28-Dec-2013)
[    5.862538] 
[    5.869386] e2fsck: /dev/block/by-name/cache: clean, 34/49152 files, 6506/196608 blocks
[    5.869393] 
[    5.890243] EXT4-fs (mmcblk0p10): mounted filesystem with ordered data mode. Opts: barrier=1,data=ordered,nomblk_io_submit,noauto_da_alloc,errors=panic
[    5.905435] SELinux: initialized (dev mmcblk0p10, type ext4), uses xattr
[    5.913110] fs_mgr: __mount(source=/dev/block/by-name/cache,target=/cache,type=ext4)=0
[    5.932500] EXT4-fs (mmcblk0p15): mounted filesystem with ordered data mode. Opts: nomblk_io_submit,errors=remount-ro
[    5.944453] SELinux: initialized (dev mmcblk0p15, type ext4), uses xattr
[    5.952136] fs_mgr: check_fs(): mount(/dev/block/by-name/alog,/logger,ext4)=0: Success
[    6.050094] fs_mgr: check_fs(): unmount(/logger) succeeded
[    6.056282] fs_mgr: Running /system/bin/e2fsck on /dev/block/by-name/alog
[    6.100967] e2fsck: e2fsck 1.42.9 (28-Dec-2013)
[    6.100974] 
[    6.107813] e2fsck: /dev/block/by-name/alog: clean, 11/5120 files, 1359/20480 blocks
[    6.107820] 
[    6.128992] EXT4-fs (mmcblk0p15): mounted filesystem with ordered data mode. Opts: barrier=1,data=ordered,nomblk_io_submit,noauto_da_alloc,errors=panic
[    6.144200] SELinux: initialized (dev mmcblk0p15, type ext4), uses xattr
[    6.151873] fs_mgr: __mount(source=/dev/block/by-name/alog,target=/logger,type=ext4)=0
[    6.175781] EXT4-fs (mmcblk0p1): ext4_orphan_cleanup: deleting unreferenced inode 65701
[    6.185841] EXT4-fs (mmcblk0p1): ext4_orphan_cleanup: deleting unreferenced inode 65690
[    6.194949] EXT4-fs (mmcblk0p1): ext4_orphan_cleanup: deleting unreferenced inode 65622
[    6.204041] EXT4-fs (mmcblk0p1): 3 orphan inodes deleted
[    6.209981] EXT4-fs (mmcblk0p1): recovery complete
[    6.223667] EXT4-fs (mmcblk0p1): mounted filesystem with ordered data mode. Opts: nomblk_io_submit,errors=remount-ro
[    6.235501] SELinux: initialized (dev mmcblk0p1, type ext4), uses xattr
[    6.243033] fs_mgr: check_fs(): mount(/dev/block/by-name/UDISK,/data,ext4)=0: Success
[    6.330090] fs_mgr: check_fs(): unmount(/data) succeeded
[    6.336084] fs_mgr: Running /system/bin/e2fsck on /dev/block/by-name/UDISK
[    6.402585] e2fsck: e2fsck 1.42.9 (28-Dec-2013)
[    6.402593] 
[    6.409508] e2fsck: /dev/block/by-name/UDISK: clean, 630/760368 files, 828192/3038208 blocks
[    6.409516] 
[    6.431152] EXT4-fs (mmcblk0p1): mounted filesystem with ordered data mode. Opts: barrier=1,data=ordered,nomblk_io_submit,noauto_da_alloc,errors=panic
[    6.446341] SELinux: initialized (dev mmcblk0p1, type ext4), uses xattr
[    6.453866] fs_mgr: __mount(source=/dev/block/by-name/UDISK,target=/data,type=ext4)=0
[    6.512912] Adding 262140k swap on /dev/block/zram0.  Priority:-1 extents:1 across:262140k SS
[    6.523817] FAT-fs (mmcblk0p16): bogus number of reserved sectors
[    6.530700] FAT-fs (mmcblk0p16): Can't find a valid FAT filesystem
[    6.784753] [DISP]disp_module_init
[    6.789401] [DISP]disp_probe
[    6.800407] [DISP] *****************************************************************
[    6.809191] [DISP] ***
[    6.811979] [DISP] *** LCD Panel Parameter Check
[    6.817301] [DISP] ***
[    6.820076] [DISP] ***             by guozhenjie
[    6.825329] [DISP] ***
[    6.828086] [DISP] *****************************************************************
[    6.836874] [DISP] *** 
[    6.839728] [DISP] *** Interface:
[    6.843442] [DISP] *** 16Bit CPU Panel
[    6.848008] [DISP] *** Lcd Frm to RGB565
[    6.852510] [DISP] *** 
[    6.855363] [DISP] *** Timing:
[    6.858959] [DISP] *** lcd_x:      240
[    6.863267] [DISP] *** lcd_y:      400
[    6.867560] [DISP] *** lcd_ht:     300
[    6.871936] [DISP] *** lcd_hbp:    20
[    6.876134] [DISP] *** lcd_vt:     3000
[    6.880541] [DISP] *** lcd_vbp:    20
[    6.884810] [DISP] *** lcd_hspw:   10
[    6.889006] [DISP] *** lcd_vspw:   10
[    6.893219] [DISP] *** lcd_frame_frq:  10Hz
[    6.898061] [DISP] *** 
[    6.900930] [DISP] *** WRN03: Recommend "lcd_dclk_frq = 54"
[    6.907236] [DISP] *** 
[    6.910171] [DISP] *** LCD Panel Parameter Check End
[    6.915806] [DISP] *****************************************************************
[    6.925281] [DISP]Fb_Init
[    6.928322] [DISP] parser_disp_init_para,line:130:    fetch script data disp_init.screen2_output_type fail
[    6.939238] [DISP] parser_disp_init_para,line:147:    fetch script data disp_init.screen2_output_mode fail
[    6.950193] [DISP] parser_disp_init_para,line:208:    fetch script data disp_init.fb2_format fail
[    6.960165] [DISP] parser_disp_init_para,line:213:    fetch script data disp_init.fb2_scaler_mode_enable fail
[    6.971354] [DISP] parser_disp_init_para,line:218:    fetch script data disp_init.fb2_width fail
[    6.981296] [DISP] parser_disp_init_para,line:223:    fetch script data disp_init.fb2_height fail
[    6.999384] [DISP]disp_probe finish
[    7.003418] -------it7259_ts_probe---in------!
[    7.003495] [DISP]capture_module_init
[    7.003997] [DISP]capture_probe
[    7.004075] [DISP]capture finish
[    7.004080] [DISP]disp_module_init finish
[    7.041517] it7259 0-0046: it7259_ts_chip_identify read id: 0A ITE7259 20
[    7.135551] Mali: ERR: /media/bryton/backserver/clean_build/20210219/bryton_r8/lichee/linux-3.4/modules/gpu/mali400/kernel_mode/driver/src/devicedrv/mali/linux/mali_platform.c
[    7.153096]            get_str_from_fex() 467
[    7.153100]            Failed to get [gpu_mali400_0, regulator_id] in sys_config.fex!
[    7.166866] 
[    7.168587] Mali: ERR: /media/bryton/backserver/clean_build/20210219/bryton_r8/lichee/linux-3.4/modules/gpu/mali400/kernel_mode/driver/src/devicedrv/mali/linux/mali_platform.c
[    7.186020]            get_u32_from_fex() 435
[    7.186024]            Failed to get [gpu_mali400_0, dvfs_status] in sys_config.fex!
[    7.199683] 
[    7.201486] Mali: ERR: /media/bryton/backserver/clean_build/20210219/bryton_r8/lichee/linux-3.4/modules/gpu/mali400/kernel_mode/driver/src/devicedrv/mali/linux/mali_platform.c
[    7.218918]            get_u32_from_fex() 435
[    7.218922]            Failed to get [gpu_mali400_0, max_level] in sys_config.fex!
[    7.232401] 
[    7.234122] Mali: ERR: /media/bryton/backserver/clean_build/20210219/bryton_r8/lichee/linux-3.4/modules/gpu/mali400/kernel_mode/driver/src/devicedrv/mali/linux/mali_platform.c
[    7.251631]            get_u32_from_fex() 435
[    7.251636]            
[    7.252663] it7259 0-0046: Current fw{3.2.4.5} cfg{E.A7.7.F}
[    7.252718] Execute Upgrade_FW_CFG()
[    7.259572] File Firmware version : 03 02 04 05
[    7.260425] File Config version : 0e a7 07 0f
[    7.260452] Chip firmware version : 03 02 04 05
[    7.260459] Chip config version : 0e a7 07 0f
[    7.260468] Upgrade_FW_CFG, print download = 0
[    7.260473] Do not need to upgrade
[    7.298616] Failed to get [gpu_mali400_0, begin_level] in sys_config.fex!
[    7.306270] 
[    7.307984] Mali: ERR: /media/bryton/backserver/clean_build/20210219/bryton_r8/lichee/linux-3.4/modules/gpu/mali400/kernel_mode/driver/src/devicedrv/mali/linux/mali_platform.c
[    7.325417]            get_u32_from_fex() 435
[    7.325422]            Failed to get [gpu_mali400_0, lv0_freq] in sys_config.fex!
[    7.338795] 
[    7.340600] Mali: ERR: /media/bryton/backserver/clean_build/20210219/bryton_r8/lichee/linux-3.4/modules/gpu/mali400/kernel_mode/driver/src/devicedrv/mali/linux/mali_platform.c
[    7.358035]            get_u32_from_fex() 435
[    7.358039]            Failed to get [gpu_mali400_0, lv0_volt] in sys_config.fex!
[    7.371425] 
[    7.373146] Mali: ERR: /media/bryton/backserver/clean_build/20210219/bryton_r8/lichee/linux-3.4/modules/gpu/mali400/kernel_mode/driver/src/devicedrv/mali/linux/mali_platform.c
[    7.390649]            get_u32_from_fex() 435
[    7.390653]            Failed to get [gpu_mali400_0, lv1_freq] in sys_config.fex!
[    7.404023] 
[    7.405743] Mali: ERR: /media/bryton/backserver/clean_build/20210219/bryton_r8/lichee/linux-3.4/modules/gpu/mali400/kernel_mode/driver/src/devicedrv/mali/linux/mali_platform.c
[    7.423176]            get_u32_from_fex() 435
[    7.423180]            Failed to get [gpu_mali400_0, lv1_volt] in sys_config.fex!
[    7.436553] 
[    7.438272] Mali: ERR: /media/bryton/backserver/clean_build/20210219/bryton_r8/lichee/linux-3.4/modules/gpu/mali400/kernel_mode/driver/src/devicedrv/mali/linux/mali_platform.c
[    7.455775]            get_u32_from_fex() 435
[    7.455779]            Failed to get [gpu_mali400_0, lv2_freq] in sys_config.fex!
[    7.469152] 
[    7.470885] Mali: ERR: /media/bryton/backserver/clean_build/20210219/bryton_r8/lichee/linux-3.4/modules/gpu/mali400/kernel_mode/driver/src/devicedrv/mali/linux/mali_platform.c
[    7.473127] it7259 0-0046: Current fw{3.2.4.5} cfg{E.A7.7.F}
[    7.474069] ------------[ cut here ]------------
[    7.474093] WARNING: at kernel/irq/manage.c:428 __enable_irq+0x88/0xd0()
[    7.474100] Unbalanced enable for IRQ 5
[    7.474106] Modules linked in: mali(O+) disp nand(O)
[    7.474149] [<c00187e4>] (unwind_backtrace+0x0/0x128) from [<c05e20fc>] (dump_stack+0x20/0x24)
[    7.474171] [<c05e20fc>] (dump_stack+0x20/0x24) from [<c003787c>] (warn_slowpath_common+0x5c/0x74)
[    7.474189] [<c003787c>] (warn_slowpath_common+0x5c/0x74) from [<c0037950>] (warn_slowpath_fmt+0x40/0x48)
[    7.474205] [<c0037950>] (warn_slowpath_fmt+0x40/0x48) from [<c00a3984>] (__enable_irq+0x88/0xd0)
[    7.474222] [<c00a3984>] (__enable_irq+0x88/0xd0) from [<c00a3a30>] (enable_irq+0x64/0x84)
[    7.474242] [<c00a3a30>] (enable_irq+0x64/0x84) from [<c0393f54>] (input_set_int_enable+0x4c/0x64)
[    7.474262] [<c0393f54>] (input_set_int_enable+0x4c/0x64) from [<c03910e0>] (it7259_ts_probe+0x510/0x778)
[    7.474281] [<c03910e0>] (it7259_ts_probe+0x510/0x778) from [<c0397ed4>] (i2c_device_probe+0xd4/0x108)
[    7.474303] [<c0397ed4>] (i2c_device_probe+0xd4/0x108) from [<c0307b80>] (driver_probe_device+0x158/0x34c)
[    7.474322] [<c0307b80>] (driver_probe_device+0x158/0x34c) from [<c0307e54>] (__device_attach+0x4c/0x50)
[    7.474340] [<c0307e54>] (__device_attach+0x4c/0x50) from [<c0305eb8>] (bus_for_each_drv+0x60/0x9c)
[    7.474357] [<c0305eb8>] (bus_for_each_drv+0x60/0x9c) from [<c030799c>] (device_attach+0x84/0xb0)
[    7.474373] [<c030799c>] (device_attach+0x84/0xb0) from [<c0306db8>] (bus_probe_device+0x38/0xa8)
[    7.474390] [<c0306db8>] (bus_probe_device+0x38/0xa8) from [<c030733c>] (deferred_probe_work_func+0x78/0xac)
[    7.474410] [<c030733c>] (deferred_probe_work_func+0x78/0xac) from [<c005159c>] (process_one_work+0x294/0x48c)
[    7.474429] [<c005159c>] (process_one_work+0x294/0x48c) from [<c0051b08>] (worker_thread+0x1a8/0x2a4)
[    7.474447] [<c0051b08>] (worker_thread+0x1a8/0x2a4) from [<c0056888>] (kthread+0x9c/0xa8)
[    7.474465] [<c0056888>] (kthread+0x9c/0xa8) from [<c0011b04>] (kernel_thread_exit+0x0/0x8)
[    7.474476] ---[ end trace 2c8264dd626959cc ]---
[    7.585573]            get_u32_from_fex() 435
[    7.585578]            Failed to get [gpu_mali400_0, lv2_volt] in sys_config.fex!
[    7.718882] 
[    7.720614] Mali: There is no regulator id for GPU.
[    7.726188] Mali: Set gpu frequency to 384 MHz
[    7.731769] Mali: Mali GPU initialization finished.
[    7.740692] Mali: Mali device driver loaded
[    7.757217] sunxikbd_script_init: key para not found, used default para. 
[    7.775704] keyname:ctp_para  subname:ctp_power_io ,get error!
[    7.782309] axp22_ldoio1: Failed to create debugfs directory
[    7.788802] get_device_para_value:get subname:bmp380 error! val.val:0 
[    7.796129] get_detect_list: script_get_item err.support_number = 16. 
[    7.803512] get_device_para_value:get subname:lsm9ds0_acc_mag error! val.val:0 
[    7.811784] get_detect_list: script_get_item err.support_number = 0. 
[    7.818976] get sysconfig para erro!
[    7.823095] Device i2c detected fail !
[    7.827307] lsensors detect fail!
[    7.831054] get sysconfig para erro!
[    7.835073] Device i2c detected fail !
[    7.839351] gyr_sensors detect fail!
[    7.843383] get sysconfig para erro!
[    7.847406] Device i2c detected fail !
[    7.851701] compass_sensors detect fail!
[    7.856107] wakeup gpio_request is failed
[    7.920043] get_device_para_value:get subname:gt9xxnew_ts error! val.val:0 
[    7.927876] get_detect_list: script_get_item err.support_number = 5. 
[    7.935352] sunxi_i2c_do_xfer()945 - [i2c0] incomplete xfer (status: 0x30, dev addr: 0x46)
[    7.960209] sunxi_i2c_do_xfer()945 - [i2c0] incomplete xfer (status: 0x30, dev addr: 0x46)
[    7.980209] sunxi_i2c_do_xfer()945 - [i2c0] incomplete xfer (status: 0x30, dev addr: 0x46)
[    8.000212] sunxi_i2c_do_xfer()945 - [i2c0] incomplete xfer (status: 0x30, dev addr: 0x46)
[    8.020209] sunxi_i2c_do_xfer()945 - [i2c0] incomplete xfer (status: 0x30, dev addr: 0x46)
[    8.040038] Device i2c detected fail !
[    8.044322] ctp detect fail!
[    8.776843] [sw_device]:no sw_devices!!! 
[    8.781370] [sw_device]sw_device_devlist_show:sw_devices detected end ! 
[    8.781375] Totally 0 devices uesed!
[    8.793032] init: [init_dev_detect]:no device used!
[    8.815495] ****************************************************************
[    8.823403] =====ctp_fetch_sysconfig_para=====. 
[    8.828655] ctp_fetch_sysconfig_para: ctp_power_io script_get_item err. 
[    8.836146] ctp_irq gpio number is 357
[    8.840467] axp22_ldoio1: Failed to create debugfs directory
[    8.846881] wakeup gpio_request is failed
[    8.851404] it7259_ts_init:ctp_ops.init_platform_resource err. 
[    8.870033] Error: Driver 'it7259' is already registered, aborting...
[    8.877218] ****************************************************************
[    8.958716] bmp380 barometer driver: init
[    8.963276] bmp_fetch_sysconfig_para: type err twi int = 0. 
[    8.969667] bmp_i2c_init i2c twi is 1 
[    8.973892] Driver 'bmp380' needs updating - please use bus_type methods
[    8.981553] bmp380_detect enter 
[    8.985215] bmp380_detect enter 
[    8.988869] bmp380_detect:addr= 0x76,i2c_num:0
[    8.994306] Read ID value is :50
[    8.997751] bmp380 Device detected!
[    9.002468] 
[    9.002472] [I]<6><BS_LOG><bmp_check_chip_id><945>read bmp380 chip id successfully
[    9.012730] 
[    9.012733] [N]<5><BS_LOG><bmp_probe><769>Bosch Sensortec Device bmp380 detected.
[    9.012738] 
[    9.024576] 
[    9.024579] [N]<5><BS_LOG><bmp_probe><778>bmp380 memory allocated
[    9.024584] 
[    9.035129] 
[    9.035132] [I]<6><BS_LOG><bmp_configure_intr_pin><1958>bmp380 configure interrupt pin sucess
[    9.046793] bmp380_soft_reset 
[    9.053309] bmp380_soft_reset ,rslt=0
[    9.058837] 
[    9.058840] [I]<6><BS_LOG><bmp_init_client><1856>bmp380_init returned 0
[    9.058845] 
[    9.070070] 
[    9.070072] [I]<6><BS_LOG><bmp_probe><794>client init done for sensor bmp380
[    9.070078] 
[    9.081898] 
[    9.081901] [I]<6><BS_LOG><bmp_probe><799>input init done for sensor bmp380
[    9.081906] 
[    9.093227] 
[    9.093230] [I]<6><BS_LOG><bmp_probe><814>sysfs register done for sensor bmp380
[    9.093235] 
[    9.107199] 
[    9.107202] [I]<6><BS_LOG><bmp_probe><836>Successfully probe sensor bmp380
[    9.107207] 
[    9.118432] bmp380_detect enter 
[    9.134088] mc32x0: init
[    9.136975] ========gsensor_fetch_sysconfig_para===================
[    9.144085] gsensor_fetch_sysconfig_para: twi_id is 1. 
[    9.149928] mc32x0_init: after fetch_sysconfig_para:  normal_i2c: 0x4c. normal_i2c[1]: 0xfffe 
[    9.159669] i2c-core: driver [mc32x0] using legacy suspend method
[    9.166565] i2c-core: driver [mc32x0] using legacy resume method
[    9.173307] gsensor_detect: Detected chip mc32x0 at adapter 1, address 0x4c
[    9.181555] sunxi_i2c_do_xfer()945 - [i2c1] incomplete xfer (status: 0x20, dev addr: 0x4c)
[    9.190783] MC3XX0_DetectPcode: 0xba
[    9.195059] sunxi_i2c_do_xfer()945 - [i2c1] incomplete xfer (status: 0x20, dev addr: 0x6c)
[    9.204275] MC3XX0_DetectPcode: 0xba
[    9.208294] [mc32x0_probe] not mCube g-sensor!
[    9.336029] nrf52_uart_init()2058 - driver initializied OK 
[    9.342629] nrf52_uart_init()2064 - platform_device_register 3 
[    9.349260] nrf52_uart_init()2068 - platform_device_register finish 
[    9.356560] sw_uart_probe()1356 - uart.3 probe ... 
[    9.362042] sw_uart_request_resource()1285 - get system resource(clk & IO)
[    9.369775] sw_uart_regulator_request()965 -  ...
[    9.375055] sw_uart_regulator_enable()991 -  ...
[    9.380321] sw_uart_probe()1378 - add uart3 port, port_type 102, uartclk 31578947
[    9.388658] sw_uart_config_port()888 -  ...
[    9.393440] sw_uart_request_port()858 - request port(ioremap & request io) 3
[    9.401308] sw_uart_request_port()859 - uart3, port->membase=0 
[    9.407988] sw_uart_request_port()860 - uart3, port->mapbase=1c28c00 
[    9.415197] sw_uart_request_port()873 - uart3, port->membase=f1c28c00 
[    9.422562] sw_uart_request_port()874 -  ... 0
[    9.427542] sw_uart_request_port()875 -  ... 0
[    9.432794] sw_uart_request_gpio()823 -  ...
[    9.437582] sw_uart_request_gpio()828 - UART3 sw_uart_request_gpio() ok!
[    9.445142] sw_uart_select_gpio_state()806 -  ...
[    9.450460] nuart3: nrfS3 at MMIO 0x1c28c00 (irq = 35) is a NRF52
[    9.457330] sw_uart_pm()913 - PM state -1 -> 0
[    9.462331] sw_uart_set_mctrl()526 - set mcr 2
[    9.467310] sw_uart_pm()913 - PM state 0 -> 3
[    9.472726] bryton_device_init
[    9.476570] file_open /system/vendor/Bryton/NordicUpdate.txt
[    9.478469] HRHighANT_Task 
[    9.495089] Nordic.bin Verion RT2 !
[    9.499138] file_open /data/NordicUpdate.txt
[    9.507515] NordicOK.bin Verion RT2 !
[    9.511845] sw_uart_pm()913 - PM state 3 -> 0
[    9.516765] nrf_uart_startup()1661 - start up ...
[    9.522197] nrf52_uart_setup()1708 - console setup baud 1000000 parity n bits 8, flow r
[    9.531151] sw_uart_set_termios()651 - set termios ...
[    9.536982] sw_uart_check_baudset()433 -  ...
[    9.541905] sw_uart_set_termios()688 - set baudrate 1000000, quot 2
[    9.548987] sw_uart_set_mctrl()526 - set mcr 23
[    9.554127] sw_uart_set_termios()794 - termios lcr 0x13 fcr 0x91 mcr 0x23 dll 0x2 dlh 0x0
[    9.563337] file_open /data/media/0/Download/bounded.txt
[    9.621518] [VFE]Welcome to Video Front End driver
[    9.627192] [VFE]vfe_init end
[    9.669967] dhd_module_init: in
[    9.673580] ======== bcm_wlan_set_plat_data ========
[    9.679215] GPIO(WL_HOST_WAKE) = 359
[    9.683345] host_oob_irq: 7
[    9.686508] host_oob_irq_flags=0x414
[    9.690610] dhd_wifi_platform_load: Enter
[    9.695147] Power-up adapter 'DHD generic adapter'
[    9.700628] wifi_platform_set_power = 1
[    9.705013] ======== PULL WL_REG_ON HIGH! ========
[    9.710390] [wifi_pm]: wifi power on
[    9.796544] >>connectivity_reset_high 1
[   10.020047] wifi_platform_bus_enumerate device present 1
[   10.025987] ======== Card detection to detect SDIO card! ========
[   10.032942] [mmc]: sdc1 set ios: clk 0Hz bm PP pm UP vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[   10.044451] [mmc]: sdc1 power_supply is null
[   10.070043] [mmc]: sdc1 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[   10.102383] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 1 err, cmd 52,  RTO !!
[   10.111554] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 1 err, cmd 52,  RTO !!
[   10.119802] [mmc]: sdc1 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[   10.132549] [mmc]: sdc1 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[   10.144710] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 1 err, cmd 8,  RTO !!
[   10.152866] *******************Try sdio*******************
[   10.159398] [mmc]: sdc1 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[   10.179330] mmc1: queuing unknown CIS tuple 0x80 (2 bytes)
[   10.187076] mmc1: queuing unknown CIS tuple 0x80 (3 bytes)
[   10.194888] mmc1: queuing unknown CIS tuple 0x80 (3 bytes)
[   10.203878] mmc1: queuing unknown CIS tuple 0x80 (7 bytes)
[   10.213631] mmc1: queuing unknown CIS tuple 0x81 (9 bytes)
[   10.307093] [mmc]: sdc1 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing SD-HS(SDR25) dt B
[   10.317369] [mmc]: sdc1 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing SD-HS(SDR25) dt B
[   10.327883] [mmc]: sdc1 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 4 timing SD-HS(SDR25) dt B
[   10.340417] mmc1: new high speed SDIO card at address 0001
[   10.347194] *******************sdio init ok*******************
[   10.363305] bcmsdh_register: register client driver
[   10.368857] bcmsdh_sdmmc: bcmsdh_sdmmc_probe Enter
[   10.374313] bcmsdh_sdmmc: bcmsdh_sdmmc_probe Enter
[   10.379746] bus num (host idx)=1, slot num (rca)=1
[   10.385156] found adapter info 'DHD generic adapter'
[   10.390856] sdioh_attach: set sd_f2_blocksize 128
[   10.396441] dhdsdio_probe : no mutex held. set lock
[   10.402104] F1 signature read @0x18000000=0x1541a9a6
[   10.410408] F1 signature OK, socitype:0x1 chip:0xa9a6 rev:0x1 pkg:0x4
[   10.418662] DHD: dongle ram size is set to 524288(orig 524288) at 0x0
[   10.426016] dhd_conf_set_chiprev: chip=0xa9a6, chiprev=1
[   10.432118] dhd_conf_set_conf_path_by_nv_path: config_path=/system/vendor/modules/config.txt
[   10.446043] dhd_conf_read_nv_by_chip: nv_by_chip_count=3
[   10.452076] dhd_conf_read_nv_by_chip: chip=0xa9a6, chiprev=0, name=nvram_ap6212.txt
[   10.460685] dhd_conf_read_nv_by_chip: chip=0xa9a6, chiprev=1, name=nvram_ap6212a.txt
[   10.469309] dhd_conf_read_nv_by_chip: chip=0xa9a6, chiprev=2, name=nvram_ap6236.txt;
[   10.479353] wl_create_event_handler(): thread:wl_event_handler:7b started
[   10.487980] p2p0: P2P Interface Registered
[   10.488960] tsk Enter, tsk = 0xc12e1410
[   10.497081] dhd_attach(): thread:dhd_watchdog_thread:7c started
[   10.503865] dhd_attach(): thread:dhd_dpc:7d started
[   10.509392] dhd_attach(): thread:dhd_rxf:7e started
[   10.514957] dhd_deferred_work_init: work queue initialized 
[   10.532065] Dongle Host Driver, version 1.201.59.7 (r506368)
[   10.532072] Compiled in drivers/net/wireless/bcmdhd on Feb 19 2021 at 19:26:26
[   10.547218] Register interface [wlan0]  MAC: 6c:21:a2:92:e4:ec
[   10.547224] 
[   10.555547] dhd_prot_ioctl : bus is down. we have nothing to do
[   10.562225] bcmsdh_oob_intr_unregister: Enter
[   10.567178] bcmsdh_oob_intr_unregister: irq is not registered
[   10.573613] dhd_txglom_enable: enable 0
[   10.577992] dhd_conf_set_txglom_params: swtxglom=0, txglom_ext=0
[   10.584748] dhd_conf_set_txglom_params: txglom_bucket_size=0
[   10.591186] dhd_conf_set_txglom_params: txglomsize=0, deferred_tx_len=0, bus_txglom=-1
[   10.600042] dhd_conf_set_txglom_params: tx_in_rx=1, tx_max_offset=0
[   10.607129] sdioh_set_mode: set txglom_mode to multi-desc
[   10.613231] dhd_bus_devreset:  WLAN OFF DONE
[   10.618220] wifi_platform_set_power = 0
[   10.622564] ======== PULL WL_REG_ON LOW! ========
[   10.627856] [wifi_pm]: wifi power off
[   10.632081] dhdsdio_probe : the lock is released.
[   10.637501] dhd_module_init: Exit err=0
[   10.655322] bcm_btlpm: Unknown symbol bt_info (err 0)
[   10.661033] bcm_btlpm: Unknown symbol bt_err (err 0)
[   10.681094] init: Starting service 'logd'...
[   10.703264] init: (Loading properties from /system/build.prop took 0.01s.)
[   10.711095] init: (Loading properties from /vendor/build.prop took 0.00s.)
[   10.718920] init: (Loading properties from /factory/factory.prop took 0.00s.)
[   10.727338] init: /recovery not specified in fstab
[   10.732797] init: void property_opt_for_mem(): start!
[   10.739504] init: bool get_lcd_resolution(int *, int *): ro.boot.lcd_x not set, disable adaptive memory function!
[   10.745334] logd.auditd: start
[   10.745406] logd.klogd: 10745369756
[   10.758421] init: void property_opt_for_mem(): get lcd resolution failed!
[   10.769849] init: Starting service 'vold'...
[   10.778076] init: Not bootcharting.
[   10.800925] >>connectivity_reset_high 2
[   10.809375]  Nordic version Image=2 Bootloader=1 SD=50 
[   10.815410] fds_init ok!!
[   10.819915] init ble service
[   10.834475] App_TaskNordic
[   10.838565] 1.App_TaskNordic
[   10.844364] UART tx
[   10.847178] 2.App_TaskNordic
[   10.872841] init: Starting service 'exec 0 (/system/bin/tzdatacheck)'...
[   10.908623] init: Service 'exec 0 (/system/bin/tzdatacheck)' (pid 141) exited with status 0
[   10.940723] SELinux: initialized (dev mmcblk0p2, type vfat), uses genfs_contexts
[   10.949422] init: Starting service 'bootclone'...
[   10.955905] init: (Loading properties from /data/local.prop took 0.00s.)
[   11.020522] init: Service 'bootclone' (pid 144) exited with status 0
[   11.028194] init: Starting service 'logd-reinit'...
[   11.039707] init: Starting service 'healthd'...
[   11.046449] init: Starting service 'lmkd'...
[   11.049625] binder: 153:153 transaction failed 29189, size 0-0
[   11.059458] init: Starting service 'servicemanager'...
[   11.067004] init: Starting service 'surfaceflinger'...
[   11.070402] logd.daemon: reinit
[   11.078451] init: Starting service 'sayeye'...
[   11.084703] init: Service 'logd-reinit' (pid 150) exited with status 0
[   11.127772] [LCD]lcd_module_init
[   11.133487] [LCD]lcd_module_init finish
[   11.138378] [LCD]open, step 0 finish
[   11.143944] init: Starting service 'zygote'...
[   11.151610] init: Starting service 'console'...
[   11.158624] init: Starting service 'netd'...
[   11.163591] [LCD]open, step 1 finish
[   11.169270] init: Starting service 'debuggerd'...
[   11.175929] init: cannot find '/system/bin/debuggerd64', disabling 'debuggerd64'
[   11.185179] init: Starting service 'ril-daemon'...
[   11.192649] init: Starting service 'drm'...
[   11.199101] init: Starting service 'media'...
[   11.205915] init: Starting service 'installd'...
[   11.212958] init: Starting service 'flash_recovery'...
[   11.220757] init: Starting service 'keystore'...
[   11.227946] init: Starting service 'logger_private'...
[   11.235872] init: Starting service 'gatekeeperd'...
[   11.261817] init: Starting service 'perfprofd'...
[   11.268693] android_usb: already disabled
[   11.275850] init: Starting service 'adbd'...
shell@astar-ococci:/ $ [   11.289966] adb_open
[   11.292702] mtp_bind_config
[   11.295906] ep_matches, wrn: endpoint already claimed, ep(0xc091b684, 0xeebea000, ep1in-bulk)
[   11.305658] ep_matches, wrn: endpoint already claimed, ep(0xc091b684, 0xeebea000, ep1in-bulk)
[   11.315354] ep_matches, wrn: endpoint already claimed, ep(0xc091b6d0, 0xeebea000, ep1out-bulk)
[   11.325194] gadget_is_softwinner_otg is not -int
[   11.330470] gadget_is_softwinner_otg is not -int
[   11.335761] adb_bind_config
[   11.339042] ep_matches, wrn: endpoint already claimed, ep(0xc091b684, 0xeebea000, ep1in-bulk)
[   11.348768] ep_matches, wrn: endpoint already claimed, ep(0xc091b6d0, 0xeebea000, ep1out-bulk)
[   11.358583] ep_matches, wrn: endpoint already claimed, ep(0xc091b684, 0xeebea000, ep1in-bulk)
[   11.372616] ep_matches, wrn: endpoint already claimed, ep(0xc091b6d0, 0xeebea000, ep1out-bulk)
[   11.383155] ep_matches, wrn: endpoint already claimed, ep(0xc091b71c, 0xef17cbc0, ep2in-bulk)
[   11.466030] [LCD]open, step 2 finish
[   11.490200] [LCD]open, step 3 finish
[   11.659157] init: Service 'logger_private' (pid 198) exited with status 1
[   11.695539] init: Starting service 'bootanim'...
[   12.044704] ###########close all layers 0
[   12.674234] ###########close all layers 0
[   13.405558] init: Service 'flash_recovery' (pid 191) exited with status 0
[   15.960228] App_TaskNordic loop
[   16.996662] warning: `system_server' uses 32-bit capabilities (legacy support in use)
[   17.890111] HRHighANT_Task loop
[   18.475986] request_suspend_state: wakeup (3->0) at 18475956802 (1970-01-10 04:45:43.198576174 UTC)
[   18.537384] type=1400 audit(794743.250:3): avc: denied { ioctl } for pid=223 comm="Binder_1" path="socket:[6311]" dev="sockfs" ino=6311 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   18.563657] type=1400 audit(794743.250:4): avc: denied { ioctl } for pid=223 comm="Binder_1" path="socket:[6311]" dev="sockfs" ino=6311 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   21.050096] App_TaskNordic loop
[   26.090049] App_TaskNordic loop
[   26.300096] HRHighANT_Task loop
[   26.961912] healthd: battery l=79 v=3801 t=27.0 h=2 st=3 c=565 chg= 1970-01-10 04:45:51.679648303 UTC
[   27.232347] type=1400 audit(794751.950:5): avc: denied { ioctl } for pid=225 comm="Binder_2" path="socket:[6421]" dev="sockfs" ino=6421 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   27.258239] type=1400 audit(794751.950:6): avc: denied { ioctl } for pid=225 comm="Binder_2" path="socket:[6421]" dev="sockfs" ino=6421 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   27.480201] lowmemorykiller: lowmem_shrink: convert oom_adj to oom_score_adj:
[   27.488389] lowmemorykiller: oom_adj 0 => oom_score_adj 0
[   27.494515] lowmemorykiller: oom_adj 1 => oom_score_adj 58
[   27.500768] lowmemorykiller: oom_adj 2 => oom_score_adj 117
[   27.507026] lowmemorykiller: oom_adj 3 => oom_score_adj 176
[   27.513397] lowmemorykiller: oom_adj 9 => oom_score_adj 529
[   27.519652] lowmemorykiller: oom_adj 15 => oom_score_adj 1000
[   28.432909] acc_open
[   28.435452] acc_release
[   28.816599] type=1400 audit(794753.530:7): avc: denied { ioctl } for pid=225 comm="Binder_2" path="socket:[6470]" dev="sockfs" ino=6470 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   28.842090] type=1400 audit(794753.530:8): avc: denied { ioctl } for pid=225 comm="Binder_2" path="socket:[6470]" dev="sockfs" ino=6470 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   28.891011] type=1400 audit(794753.610:9): avc: denied { ioctl } for pid=223 comm="Binder_1" path="socket:[6472]" dev="sockfs" ino=6472 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   28.916947] type=1400 audit(794753.610:10): avc: denied { ioctl } for pid=223 comm="Binder_1" path="socket:[6472]" dev="sockfs" ino=6472 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   29.046770] SELinux: initialized (dev fuse, type fuse), uses genfs_contexts
[   29.056552] SELinux: initialized (dev fuse, type fuse), uses genfs_contexts
[   29.065979] SELinux: initialized (dev fuse, type fuse), uses genfs_contexts
[   30.682821] healthd: battery l=78 v=3802 t=27.0 h=2 st=3 c=559 chg= 1970-01-10 04:45:55.405363680 UTC
[   30.862857] type=1400 audit(794755.580:11): avc: denied { ioctl } for pid=223 comm="Binder_1" path="socket:[6676]" dev="sockfs" ino=6676 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   30.889036] type=1400 audit(794755.580:12): avc: denied { ioctl } for pid=223 comm="Binder_1" path="socket:[6676]" dev="sockfs" ino=6676 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   31.140094] App_TaskNordic loop
[   31.229741] type=1400 audit(794755.940:13): avc: denied { ioctl } for pid=223 comm="Binder_1" path="socket:[6707]" dev="sockfs" ino=6707 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   31.257526] type=1400 audit(794755.940:14): avc: denied { ioctl } for pid=223 comm="Binder_1" path="socket:[6707]" dev="sockfs" ino=6707 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   31.558413] type=1400 audit(794756.270:15): avc: denied { ioctl } for pid=1567 comm="Binder_6" path="socket:[7521]" dev="sockfs" ino=7521 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   31.586454] type=1400 audit(794756.270:16): avc: denied { ioctl } for pid=1567 comm="Binder_6" path="socket:[7521]" dev="sockfs" ino=7521 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   33.436780] type=1400 audit(794758.150:17): avc: denied { ioctl } for pid=223 comm="Binder_1" path="socket:[6809]" dev="sockfs" ino=6809 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   33.464646] type=1400 audit(794758.150:18): avc: denied { ioctl } for pid=223 comm="Binder_1" path="socket:[6809]" dev="sockfs" ino=6809 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   33.497843] type=1400 audit(794758.180:19): avc: denied { ioctl } for pid=225 comm="Binder_2" path="socket:[6814]" dev="sockfs" ino=6814 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   33.523185] type=1400 audit(794758.180:20): avc: denied { ioctl } for pid=225 comm="Binder_2" path="socket:[6814]" dev="sockfs" ino=6814 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   33.549388] type=1400 audit(794758.210:21): avc: denied { ioctl } for pid=1567 comm="Binder_6" path="socket:[7553]" dev="sockfs" ino=7553 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   33.577247] type=1400 audit(794758.210:22): avc: denied { ioctl } for pid=1567 comm="Binder_6" path="socket:[7553]" dev="sockfs" ino=7553 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   34.059975] type=1400 audit(794758.770:23): avc: denied { ioctl } for pid=626 comm="system_server" path="socket:[7565]" dev="sockfs" ino=7565 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   34.090402] type=1400 audit(794758.770:24): avc: denied { ioctl } for pid=626 comm="system_server" path="socket:[7565]" dev="sockfs" ino=7565 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   34.720110] HRHighANT_Task loop
[   36.370168] App_TaskNordic loop
[   36.922675] type=1400 audit(794761.640:25): avc: denied { read write } for pid=1568 comm="sport.r8service" name="ttyS1" dev="tmpfs" ino=4776 scontext=u:r:system_app:s0 tcontext=u:object_r:tty_device:s0 tclass=chr_file permissive=1
[   36.947340] type=1400 audit(794761.640:26): avc: denied { open } for pid=1568 comm="sport.r8service" name="ttyS1" dev="tmpfs" ino=4776 scontext=u:r:system_app:s0 tcontext=u:object_r:tty_device:s0 tclass=chr_file permissive=1
[   37.510260] binder: 1561:1586 refcount change on invalid ref 10
[   37.801628] bryton_sensor_open: major 10 minor 41 (pid 1568)
[   37.807997] bryton sensor driver open
[   37.812378] nrf52 version 0.39.2.0
[   37.817048] type=1400 audit(794762.520:27): avc: denied { read write } for pid=1568 comm=":remote_service" name="bryton_ble" dev="tmpfs" ino=1233 scontext=u:r:system_app:s0 tcontext=u:object_r:device:s0 tclass=chr_file permissive=1
[   37.817922] SET_DEVICE_INFO_CMD 
[   37.817937] SetDeviceInfo>> UD1804200400003688 IV002.002.0002.02.002.002 MNRider860
[   37.817956] ble_advertising_start..... 
[   37.857809] ble_sensor_setup-->
[   37.860491] type=1400 audit(794762.520:28): avc: denied { open } for pid=1568 comm=":remote_service" name="bryton_ble" dev="tmpfs" ino=1233 scontext=u:r:system_app:s0 tcontext=u:object_r:device:s0 tclass=chr_file permissive=1
[   37.860696] type=1400 audit(794762.530:29): avc: denied { ioctl } for pid=1568 comm=":remote_service" path="/dev/bryton_ble" dev="tmpfs" ino=1233 ioctlcmd=6b47 scontext=u:r:system_app:s0 tcontext=u:object_r:device:s0 tclass=chr_file permissive=1
[   37.909105] HR 0 1
[   37.911604] set_Hr_State:0
[   37.915071] set_ant_device_cmd 121 51973 9 >> 
[   37.940200]  COMBO open id=51973 <<Open_Channel 
[   37.955426]  Combo open ack 
[   38.062166] binder: 1561:1721 refcount change on invalid ref 10
[   38.069152] binder: 1561:1721 refcount change on invalid ref 10
[   38.075823] binder: transaction release 6807 bad handle 10
[   38.140149] set_ant_device_cmd 122 0 4 >> 
[   38.345284] set_ant_device_cmd 123 0 7 >> 
[   38.550147] set_ant_device_cmd 120 49743 0 >> 
[   38.750079] <<3.D 0>>
[   38.752682] <<1.D 2>>
[   38.755232] set_ant_device_cmd 11 0 13 >> 
[   38.759929]  HR open id=49743 <<Open_Channel 
[   38.776992] <<4.D 3>>
[   38.779588]  HR open ack set_ant_device_cmd 34 0 23 >> 
[   39.158831] set_ant_device_cmd 125 0 16 >> 
[   39.364044] Set_BikeWheelSize = 209
[   39.616904] type=1400 audit(794764.330:30): avc: denied { read } for pid=1568 comm=":remote_service" name="tombstone_00" dev="mmcblk0p1" ino=580498 scontext=u:r:system_app:s0 tcontext=u:object_r:tombstone_data_file:s0 tclass=file permissive=1
[   39.642024] type=1400 audit(794764.330:31): avc: denied { open } for pid=1568 comm=":remote_service" name="tombstone_00" dev="mmcblk0p1" ino=580498 scontext=u:r:system_app:s0 tcontext=u:object_r:tombstone_data_file:s0 tclass=file permissive=1
[   39.666915] type=1400 audit(794764.330:32): avc: denied { getattr } for pid=1568 comm=":remote_service" path="/data/tombstones/tombstone_00" dev="mmcblk0p1" ino=580498 scontext=u:r:system_app:s0 tcontext=u:object_r:tombstone_data_file:s0 tclass=file permissive=1
[   40.604704] type=1400 audit(794765.320:33): avc: denied { ioctl } for pid=223 comm="Binder_1" path="socket:[7012]" dev="sockfs" ino=7012 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   40.630222] type=1400 audit(794765.320:34): avc: denied { ioctl } for pid=223 comm="Binder_1" path="socket:[7012]" dev="sockfs" ino=7012 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   40.657322] type=1400 audit(794765.370:35): avc: denied { ioctl } for pid=225 comm="Binder_2" path="socket:[7014]" dev="sockfs" ino=7014 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   40.687618] type=1400 audit(794765.370:36): avc: denied { ioctl } for pid=225 comm="Binder_2" path="socket:[7014]" dev="sockfs" ino=7014 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   40.716077] type=1400 audit(794765.430:37): avc: denied { ioctl } for pid=689 comm="Binder_1" path="socket:[9319]" dev="sockfs" ino=9319 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   40.742568] type=1400 audit(794765.430:38): avc: denied { ioctl } for pid=689 comm="Binder_1" path="socket:[9319]" dev="sockfs" ino=9319 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   41.184995] type=1400 audit(794765.900:39): avc: denied { ioctl } for pid=1566 comm="Binder_5" path="socket:[7025]" dev="sockfs" ino=7025 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   41.210894] type=1400 audit(794765.900:40): avc: denied { ioctl } for pid=1566 comm="Binder_5" path="socket:[7025]" dev="sockfs" ino=7025 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   41.289977] alloc_contig_range test_pages_isolated(70cd0, 70d2e) failed, start 70cd0, order 0
[   41.460151] App_TaskNordic loop
[   41.578637] type=1400 audit(794766.290:41): avc: denied { ioctl } for pid=689 comm="Binder_1" path="socket:[8696]" dev="sockfs" ino=8696 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   41.603763] type=1400 audit(794766.290:42): avc: denied { ioctl } for pid=689 comm="Binder_1" path="socket:[8696]" dev="sockfs" ino=8696 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   41.629246] type=1400 audit(794766.300:43): avc: denied { ioctl } for pid=797 comm="Binder_3" path="socket:[8695]" dev="sockfs" ino=8695 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   41.654884] type=1400 audit(794766.300:44): avc: denied { ioctl } for pid=797 comm="Binder_3" path="socket:[8695]" dev="sockfs" ino=8695 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   41.706548] init: Service 'bootanim' (pid 236) exited with status 0
[   41.943161] init: Starting service 'nand_trim'...
[   41.979362] init: avc:  denied  { set } for property=ctl.nand_trim scontext=u:r:trim:s0 tcontext=u:object_r:ctl_default_prop:s0 tclass=property_service
[   41.994650] init: Service 'nand_trim' is being killed...
[   42.001394] type=1400 audit(794766.690:45): avc: denied { connectto } for pid=1786 comm="nand_trim" path="/dev/socket/property_service" scontext=u:r:trim:s0 tcontext=u:r:init:s0 tclass=unix_stream_socket permissive=1
[   42.008652] init: Service 'nand_trim' (pid 1786) killed by signal 9
[   42.008687] init: Service 'nand_trim' (pid 1786) killing any children in process group
[   42.380129] HRHighANT_Task loop
[   43.413613] binder: 1809:1818 refcount change on invalid ref 6
[   43.624227] binder: 1809:1827 refcount change on invalid ref 6
[   43.630948] binder: 1809:1827 refcount change on invalid ref 6
[   43.637562] binder: transaction release 9294 bad handle 6
[   45.758556] [dsm] Scene:0 "sayeye" (pid:168) brytonboardtest 
[   46.570110] App_TaskNordic loop
[   48.751510] CPU3: shutdown
[   48.754636] [hotplug]: cpu(1) try to kill cpu(3)
[   48.759867] [hotplug]: cpu3 is killed! .
[   49.251391] CPU1: shutdown
[   49.254559] [hotplug]: cpu(0) try to kill cpu(1)
[   49.259785] [hotplug]: cpu1 is killed! .
[   49.260871] CPU1: Booted secondary processor
[   50.751300] CPU2: shutdown
[   50.754391] [hotplug]: cpu(0) try to kill cpu(2)
[   50.759682] [hotplug]: cpu2 is killed! .
[   50.780048] HRHighANT_Task loop
[   51.620352] App_TaskNordic loop
[   51.751236] CPU1: shutdown
[   51.754357] [hotplug]: cpu(0) try to kill cpu(1)
[   51.759579] [hotplug]: cpu1 is killed! .
[   54.641309] it7259 0-0046: Ignore the touch data
[   54.673686] [dsm] Scene:0 "sayeye" (pid:168) brytonboardtest 
[   54.699908] [dsm] Scene:0 "sayeye" (pid:168) brytonboardtest 
[   51.760650] CPU1: Booted secondary processor
[   55.088293] type=1400 audit(794779.800:46): avc: denied { ioctl } for pid=691 comm="Binder_2" path="socket:[8184]" dev="sockfs" ino=8184 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   55.114464] type=1400 audit(794779.800:47): avc: denied { ioctl } for pid=691 comm="Binder_2" path="socket:[8184]" dev="sockfs" ino=8184 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   55.296595] type=1400 audit(794780.010:48): avc: denied { ioctl } for pid=1566 comm="Binder_5" path="socket:[8695]" dev="sockfs" ino=8695 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   55.322252] type=1400 audit(794780.010:49): avc: denied { ioctl } for pid=1566 comm="Binder_5" path="socket:[8695]" dev="sockfs" ino=8695 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   56.660311] App_TaskNordic loop
[   56.757182] CPU1: shutdown
[   56.761685] [hotplug]: cpu(0) try to kill cpu(1)
[   56.767724] [hotplug]: cpu1 is killed! .
[   59.180228] HRHighANT_Task loop
[   56.764370] CPU1: Booted secondary processor
[   60.753753] healthd: battery l=77 v=3905 t=26.0 h=2 st=3 c=222 chg= 1970-01-10 04:46:25.475942278 UTC
[   61.071831] it7259 0-0046: Ignore the touch data
[   61.124763] type=1400 audit(794785.840:50): avc: denied { ioctl } for pid=797 comm="Binder_3" path="socket:[8192]" dev="sockfs" ino=8192 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   61.151788] type=1400 audit(794785.840:51): avc: denied { ioctl } for pid=797 comm="Binder_3" path="socket:[8192]" dev="sockfs" ino=8192 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   61.297396] type=1400 audit(794786.010:52): avc: denied { ioctl } for pid=1549 comm="Binder_4" path="socket:[8695]" dev="sockfs" ino=8695 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   61.324416] type=1400 audit(794786.010:53): avc: denied { ioctl } for pid=1549 comm="Binder_4" path="socket:[8695]" dev="sockfs" ino=8695 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   61.730036] App_TaskNordic loop
[   61.751213] CPU1: shutdown
[   61.754319] [hotplug]: cpu(0) try to kill cpu(1)
[   61.759563] [hotplug]: cpu1 is killed! .
[   66.576200] it7259 0-0046: Ignore the touch data
[   66.604894] StoreNoridcRAMtoFlash no need!
[   61.760655] CPU1: Booted secondary processor
[   66.809091] [dsm] Scene:0 "sayeye" (pid:168) brytonboardtest 
[   66.880648] [dsm] Scene:0 "sayeye" (pid:168) brytonboardtest 
[   66.920366] [dsm] Scene:0 "sayeye" (pid:168) brytonboardtest 
[   66.939316] [dsm] Scene:0 "sayeye" (pid:168) brytonboardtest 
[   66.950706] type=1400 audit(794791.630:54): avc: denied { ioctl } for pid=1592 comm="Binder_7" path="socket:[8695]" dev="sockfs" ino=8695 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   67.054261] type=1400 audit(794791.630:55): avc: denied { ioctl } for pid=1592 comm="Binder_7" path="socket:[8695]" dev="sockfs" ino=8695 ioctlcmd=7704 scontext=u:r:system_server:s0 tcontext=u:r:system_server:s0 tclass=unix_stream_socket permissive=1
[   67.092061] [dsm] Scene:0 "sayeye" (pid:168) brytonboardtest 
[   50.760692] CPU2: Booted secondary processor
[   67.382255] type=1400 audit(794792.020:56): avc: denied { ioctl } for pid=1077 comm="Binder_3" path="socket:[10551]" dev="sockfs" ino=10551 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   67.409995] type=1400 audit(794792.020:57): avc: denied { ioctl } for pid=1077 comm="Binder_3" path="socket:[10551]" dev="sockfs" ino=10551 ioctlcmd=7704 scontext=u:r:surfaceflinger:s0 tcontext=u:r:surfaceflinger:s0 tclass=unix_stream_socket permissive=1
[   67.580117] HRHighANT_Task loop
[   48.760952] CPU3: Booted secondary processor
[   69.830189] Nordic_Power_Off
[   70.081583] binder: 2045:2054 refcount change on invalid ref 10
[   70.571253] binder: 2045:2074 refcount change on invalid ref 10
[   70.578083] binder: 2045:2074 refcount change on invalid ref 10
[   70.584803] binder: transaction release 13898 bad handle 10
[   70.833718] Nordic_Power_Off
[   71.251268] CPU3: shutdown
[   71.254409] [hotplug]: cpu(0) try to kill cpu(3)
[   71.259704] [hotplug]: cpu3 is killed! .
[   71.847843] Nordic_Power_Off
[   72.890729] Nordic_Power_Off
[   71.260766] CPU3: Booted secondary processor
[   73.908442] Nordic_Power_Off
[   74.187340] SysRq : Emergency Remount R/O
[   74.194277] EXT4-fs (mmcblk0p10): re-mounted. Opts: (null)
[   74.212854] EXT4-fs (mmcblk0p15): re-mounted. Opts: (null)
[   74.226376] EXT4-fs (mmcblk0p1): re-mounted. Opts: (null)
[   74.234710] Emergency Remount complete
[   74.294083] drivers/cpufreq/autohotplug.c:reboot_notifier_call: stop autoplug begin
[   74.302759] drivers/cpufreq/autohotplug.c:reboot_notifier_call: stop autoplug done
[   74.311343] drivers/cpufreq/cpufreq.c:reboot_notifier_call: stop none boot cpus
[   74.330873] CPU1: shutdown
[   74.334087] [hotplug]: cpu(3) try to kill cpu(1)
[   74.339312] [hotplug]: cpu1 is killed! .
[   74.351042] CPU2: shutdown
[   74.354240] [hotplug]: cpu(3) try to kill cpu(2)
[   74.359468] [hotplug]: cpu2 is killed! .
[   74.391035] CPU3: shutdown
[   74.394255] [hotplug]: cpu(0) try to kill cpu(3)
[   74.399476] [hotplug]: cpu3 is killed! .
[   74.431432] drivers/cpufreq/cpufreq.c:reboot_notifier_call: stop none boot cpus done
[   74.478493] [LCD]close, step 0 finish
[   74.540101] [LCD]close, step 1 finish
[   74.590105] [LCD]close, step 2 finish
[   74.640477] [LCD]close, step 3 finish
[   74.746880] type=1400 audit(794799.460:58): avc: denied { ioctl } for pid=1739 comm=":remote_service" path="/dev/bryton_ble" dev="tmpfs" ino=1233 ioctlcmd=6b14 scontext=u:r:system_app:s0 tcontext=u:object_r:device:s0 tclass=chr_file permissive=1
[   75.290132] [mmc]: shutdown_mmc: is not card 2, return
[   75.295972] [mmc]: shutdown_mmc: mmc 1 shutdown exit..ok
[   75.313057] [mmc]: try to disable cache
[   75.340162] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing LEGACY(SDR12) dt B
[   75.376514] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[   75.409364] [mmc]: sdc2 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[   75.440248] [mmc]: sdc2 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[   75.479033] [mmc]: sdc2 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[   75.520085] [mmc]: shutdown_mmc: mmc 2 shutdown exit..ok
[   75.526194] [alarmtimer] have no shutdown alarm! alarmtimer_shutdown 316
[   75.619149] pmu_shutdown_chgcur = 1300000
[   75.650135] current_limit = 1300000
[   75.660184] Power down.
[   75.663026] [axp] send power-off command!
```
