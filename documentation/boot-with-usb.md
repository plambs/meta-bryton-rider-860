# USB charge boot serial output

## Boot0 (sunxi) at 115200bauds
```
HELLO! BOOT0 is starting!
boot0 version : 4.0.0
fel_flag = 0x00000000
rtc[0] value = 0x00000000
rtc[1] value = 0x00000000
rtc[2] value = 0x00000000
rtc[3] value = 0x00000000
DRAM DRIVE INFO: V1.6
DRAM Type =3 (2:DDR2,3:DDR3,6:LPDDR2,7:LPDDR3)
DRAM zq value: 00003bbbDRAM CLK =480 MHZ
USE PLL DDR1
USE PLL NORMAL
PLL FREQUENCE = 960 MHZ
DRAM PLL DDR1 frequency extend open !
DRAM master priority setting ok.
�uto calculate timing parameter!
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
[mmc]: mmc 2 cmd 55 err 00000100
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
set_mmc_para,sdly 25M 0
Succeed in loading uboot from sdmmc flash.
Ready to disable icache.
Jump to secend Boot.
```

## U-Boot at 150000bauds
```
[      0.335]U-Boot 2011.09-rc1-00000-g54ab542-dirty (Feb 19 2021 - 19:22:44) Allwinner Technology 
[      0.343]version: 1.1.0
[      0.421]pmbus:   normal or secure os
ready
[      0.425]PMU: AXP221
[      0.426]PMU: AXP22x found
bat_vol=4232, ratio=87
[      0.431]PMU: dcdc3 1200
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
vbus exist
vbus pc exist, limit to pc
fel key old mode
run key detect
no key found
no key input
dram_para_set start
dram_para_set end
[      0.630]DRAM:  1 GiB
relocation Offset is: 35b02000
smcl's set manager is NULL
<axp22, dc1sw>
workmode = 0
MMC:	 2
[      0.679][mmc]: mmc driver ver 2016-03-24 19:30:15
[      0.683][mmc]: get sdc_phy_wipe fail.
[      0.686][mmc]: get sdc0 sdc_erase fail.
[      0.689][mmc]: get sdc_2xmode ok, val = 1
[      0.692][mmc]: get sdc_ddrmode fail  used =  0
[      0.696][mmc]: get sdc_f_max fail,use default  50000000Hz
[      0.700][mmc]: get card_line ok, card_line = 4
[      0.703][mmc]: undefined value 0 or kernel not use auto sample,use default dly
[      0.709][mmc]: SUNXI SD/MMC: 2
[      0.712][mmc]: mmc_config_clock: clk 400000
[      0.727][mmc]: *Try SD card 2*
[      0.731][mmc]: mmc 2 cmd 8 err 100
[      0.736][mmc]: mmc send if cond failed
[      0.740][mmc]: mmc 2 cmd 55 err 100
[      0.745][mmc]: send app cmd failed
[      0.747][mmc]: *Try MMC card 2*
[      0.799][mmc]: mmc_config_clock: clk 25000000
[      0.814][mmc]: mmc re-update_phase
[      0.821][mmc]: mmc re-update_phase
[      0.829][mmc]: mmc re-update_phase
[      0.835][mmc]: mmc re-update_phase
[      0.983][mmc]: mmc_config_clock: clk 25000000
[      0.992][mmc]: mmc_config_clock: clk 50000000
[      1.001][mmc]: CID 0x70010054 0x42323831 0x3620137d 0x620f160d
[      1.005][mmc]: MMC v5.1
[      1.007][mmc]: mmc clk 50000000
[      1.009][mmc]: SD/MMC Card: 4bit, capacity: 14976MB
[      1.013][mmc]: boot0 capacity: 4000KB,boot1 capacity: 4000KB
[      1.018][mmc]: ***SD/MMC 2 init OK!!!***
[      1.028][mmc]: erase_grp_size:0x400WrBlk * 0x200 = 0x80000 Byte
[      1.033][mmc]: secure_feature 0x55
[      1.035][mmc]: secure_removal_type  0x1
[      1.039]sunxi flash init ok
sunxi secure storage is not supported
[      1.054]usb burn from boot
delay time 0
[      1.123]usb prepare ok
usb sof ok
[      1.340]usb probe ok
[      1.341]usb setup ok
set address 0xf
[      4.343]timer occur
[      4.378]do_burn_from_boot usb : have no handshake
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
[      4.499][mmc]: blkcnt should not be 0
[      4.501][mmc]: blkcnt should not be 0
serial is: 1804200400003688
mount part name bootloader
cant open script.bin, maybe it is not exist
WORK_MODE_BOOT
board_status_probe
[      4.537]power trigger
bat_exist=32
sunxi_bmp_charger_display
screen_id =0, screen_width =240, screen_height =400
[      4.598]Hit any key to stop autoboot:  0 
read boot or recovery all
[      5.246]sunxi flash read :offset 4000000, 15012262 bytes OK
no signature
[      5.257]ready to boot
para err in disp_ioctl, cmd = 0xa,screen id = 1
[      5.262][mmc]: mmc exit start
[      5.265][mmc]: mmc_config_clock: clk 50000000
[      5.275][mmc]: mmc_config_clock: clk 400000
[      5.291][mmc]: mmc 2 cmd 8 err 100
[      5.296][mmc]: mmc send if cond failed
[      5.300][mmc]: mmc 2 cmd 55 err 100
[      5.305][mmc]: send app cmd failed
[      5.318][mmc]: get sdc_phy_wipe fail.
[      5.321][mmc]: get sdc0 sdc_erase fail.
[      5.324][mmc]: get sdc_2xmode ok, val = 1
[      5.327][mmc]: get sdc_ddrmode fail  used =  0
[      5.330][mmc]: get sdc_f_max fail,use default  50000000Hz
[      5.335][mmc]: get card_line ok, card_line = 4
[      5.338][mmc]: undefined value 0 or kernel not use auto sample,use default dly
[      5.344][mmc]: mmc 2 exit ok
[      5.346]
Starting kernel ...
```

## Linux boot at 115200bauds
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
[    0.000000] Kernel command line: boot_type=2 disp_para=100 fb_base=0x0 androidboot.mode=charger config_size=42776 androidboot.serialno=1804200400003688 androidboot.hardware=sun8i console=ttyS0,115200 root=/dev/mmcblk0p7 init=/init ion_cma_list=120m,256m loglevel=8 partitions=bootloader@mmcblk0p2:env@mmcblk0p5:boot@mmcblk0p6:system@mmcblk0p7:misc@mmcblk0p8:recovery@mmcblk0p9:cache@mmcblk0p10:metadata@mmcblk0p11:private@mmcblk0p12:frp@mmcblk0p13:empty@mmcblk0p14:alog@mmcblk0p15:media_data@mmcblk0p16:UDISK@mmcblk0p1
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
[    0.000558] SELinux:  Initializing.
[    0.000668] SELinux:  Starting in permissive mode
[    0.000773] Mount-cache hash table entries: 512
[    0.001936] Initializing cgroup subsys debug
[    0.001954] Initializing cgroup subsys cpuacct
[    0.001966] Initializing cgroup subsys freezer
[    0.002013] CPU: Testing write buffer coherency: ok
[    0.002073] ftrace: allocating 22535 entries in 67 pages
[    0.030315] CPU0: thread -1, cpu 0, socket 0, mpidr 80000000
[    0.030335] [sunxi_smp_prepare_cpus] enter
[    0.030382] Setting up static identity map for 0x405ed588 - 0x405ed5e0
[    0.010000] CPU1: Booted secondary processor
[    0.010000] CPU1: thread -1, cpu 1, socket 0, mpidr 80000001
[    0.010000] CPU2: Booted secondary processor
[    0.010000] CPU2: thread -1, cpu 2, socket 0, mpidr 80000002
[    0.010000] CPU3: Booted secondary processor
[    0.010000] CPU3: thread -1, cpu 3, socket 0, mpidr 80000003
[    0.210184] Brought up 4 CPUs
[    0.210184] SMP: Total of 4 processors activated (19200.00 BogoMIPS).
[    0.210466] devtmpfs: initialized
[    0.214488] VFP support v0.3: implementor 41 architecture 2 part 30 variant 7 rev 5
[    0.220147] pinctrl core: initialized pinctrl subsystem
[    0.231177] NET: Registered protocol family 16
[    0.252463] DMA: preallocated 2048 KiB pool for atomic coherent allocations
[    0.252547] script_sysfs_init success
[    0.252582] sunxi_dump_init success
[    0.253721] gpiochip_add: registered GPIOs 0 to 383 on device: sunxi-pinctrl
[    0.255157] sunxi-pinctrl sunxi-pinctrl: initialized sunXi PIO driver
[    0.255564] gpiochip_add: registered GPIOs 1024 to 1031 on device: axp-pinctrl
[    0.256838] persistent_ram: found existing buffer, size 58228, start 44256
[    0.467288] console [ram-1] enabled
[    0.468217] [sunxi-module]: [sunxi-module.0] probe success
[    0.468357] script config pll3 to 297 Mhz
[    0.468543] script config pll4 to 300 Mhz
[    0.468669] script config pll6 to 600 Mhz
[    0.468772] script config pll8 to 408 Mhz
[    0.468963] script config pll9 to 480 Mhz
[    0.469068] script config pll10 to 297 Mhz
[    0.469166] sunxi_default_clk_init
[    0.469344] try to set pll6ahb1 to 200000000
[    0.469485] try to set ahb clk source to pll6ahb1
[    0.469584] set ahb clk source to pll6ahb1
[    0.469762] try to set ahb1 to 200000000
[    0.469863] try to set apb1 to 100000000
[    0.480304] bio: create slab <bio-0> at 0
[    0.480724] [ARISC] :sunxi-arisc driver v1.60
[    0.525756] [ARISC] :arisc version: [v0.1.11]
[    0.525960] [sunxi-module]: arisc register success
[    0.743964] [ARISC] :sunxi-arisc driver v1.60 startup succeeded
[    0.750325] usbcore: registered new interface driver usbfs
[    0.750572] usbcore: registered new interface driver hub
[    0.750693] usbcore: registered new device driver usb
[    0.750693] twi_chan_cfg()335 - [twi0] has no twi_regulator.
[    0.750693] twi_chan_cfg()335 - [twi1] has no twi_regulator.
[    0.750693] twi_chan_cfg()335 - [twi2] has no twi_regulator.
[    0.751723] Linux video capture interface: v2.00
[    0.760428] current_limit = 500000
[    0.760853] Advanced Linux Sound Architecture Driver Version 1.0.25.
[    0.761361] cfg80211: Calling CRDA to update world regulatory domain
[    0.761332] Switching to clocksource arch_sys_counter
[    0.782794] FS-Cache: Loaded
[    0.783264] CacheFiles: Loaded
[    0.796426] NET: Registered protocol family 2
[    0.796920] IP route cache hash table entries: 32768 (order: 5, 131072 bytes)
[    0.797741] TCP established hash table entries: 131072 (order: 8, 1048576 bytes)
[    0.799814] TCP bind hash table entries: 65536 (order: 7, 786432 bytes)
[    0.800905] TCP: Hash tables configured (established 131072 bind 65536)
[    0.801090] TCP: reno registered
[    0.801198] UDP hash table entries: 512 (order: 2, 16384 bytes)
[    0.801405] UDP-Lite hash table entries: 512 (order: 2, 16384 bytes)
[    0.801873] NET: Registered protocol family 1
[    0.802511] RPC: Registered named UNIX socket transport module.
[    0.802615] RPC: Registered udp transport module.
[    0.802795] RPC: Registered tcp transport module.
[    0.802894] RPC: Registered tcp NFSv4.1 backchannel transport module.
[    0.803329] Unpacking initramfs...
[    1.088530] Freeing initrd memory: 4104K
[    1.089928] [pm]aw_pm_init!
[    1.090149] standby_mode = 1.
[    1.090250] wakeup src cnt is : 2.
[    1.090353] [exstandby]leave extended_standby_enable_wakeup_src : event 0x800000
[    1.090535] [exstandby]leave extended_standby_enable_wakeup_src : wakeup_gpio_map 0x80
[    1.090638] [exstandby]leave extended_standby_enable_wakeup_src : wakeup_gpio_group 0x0
[    1.090821] [exstandby]leave extended_standby_enable_wakeup_src : event 0x800000
[    1.091003] [exstandby]leave extended_standby_enable_wakeup_src : wakeup_gpio_map 0x280
[    1.091186] [exstandby]leave extended_standby_enable_wakeup_src : wakeup_gpio_group 0x0
[    1.091330] sunxi_reg_init enter
[    1.092566] audit: initializing netlink socket (disabled)
[    1.092719] type=2000 audit(1.090:1): initialized
[    1.096324] highmem bounce pool size: 64 pages
[    1.098738] NTFS driver 2.1.30 [Flags: R/W].
<6>[    1.099046] fuse init (API version 7.18)
[    1.099754] msgmni has been set to 1478
[    1.099894] SELinux:  Registering netfilter hooks
[    1.102251] Block layer SCSI generic (bsg) driver version 0.4 loaded (major 253)
[    1.102446] io scheduler noop registered
[    1.102546] io scheduler deadline registered
[    1.102817] io scheduler cfq registered (default)
[    1.103418] pwm module init!
[    1.104111] sw_uart_get_devinfo()1503 - uart0 has no uart_regulator.
[    1.104300] sw_uart_get_devinfo()1503 - uart1 has no uart_regulator.
[    1.104405] sw_uart_get_devinfo()1503 - uart2 has no uart_regulator.
[    1.104590] sw_uart_get_devinfo()1473 - get uart3's usedcfg failed
[    1.105320] uart0: ttyS0 at MMIO 0x1c28000 (irq = 32) is a SUNXI
[    1.105430] sw_uart_pm()890 - uart0 clk is already enable
[    1.105621] sw_console_setup()1233 - console setup baud 115200 parity n bits 8, flow n
[    1.201104] console [ttyS0] enabled
[    2.075609] uart1: ttyS1 at MMIO 0x1c28400 (irq = 33) is a SUNXI
[    2.082763] uart2: ttyS2 at MMIO 0x1c28800 (irq = 34) is a SUNXI
[    2.094923] loop: module loaded
[    2.098685] [rf_pm]: select module num is 2
[    2.103421] [rf_pm]: module power1 name axp22_dldo1
[    2.108975] [rf_pm]: module power1 vol 3000000
[    2.113986] [rf_pm]: module power2 name axp22_eldo1
[    2.119532] [rf_pm]: module power2 vol 3000000
[    2.124542] [rf_pm]: module power3 name axp22_dldo2
[    2.130109] [rf_pm]: module power3 vol 3300000
[    2.135112] [rf_pm]: module power3 name axp22_dldo3
[    2.140592] [rf_pm]: module power4 vol 3000000
[    2.145667] [rf_pm]: mod has no power_switch gpio
[    2.150964] [rf_pm]: mod has no chip_en gpio
[    2.155848] [rf_pm]: lpo_use_apclk: losc_out
[    2.160853] [rf_pm]: set axp22_dldo1 to 3000000 v
[    2.166266] [rf_pm]: enable axp22_dldo1.
[    2.171347] [rf_pm]: set axp22_eldo1 to 3000000 v
[    2.176737] [rf_pm]: enable axp22_eldo1.
[    2.181277] [rf_pm]: set axp22_dldo2 to 3300000 v
[    2.186740] [rf_pm]: enable axp22_dldo2.
[    2.191725] [rf_pm]: set axp22_dldo3 to 3000000 v
[    2.197176] [rf_pm]: enable axp22_dldo3.
[    2.202155] [rf_pm]: mod info power switch -1
[    2.207239] [rf_pm]: set losc_out 32k out
[    2.211869] scene_lock_init name=rf_pm
[    2.216377] [wifi_pm]: wifi gpio init is OK !!
[    2.221421] [rfkill]: init no bt used in configuration
[    2.227273] sunxi_spi_chan_cfg()1355 - [spi-0] has no spi_regulator.
[    2.234417] tun: Universal TUN/TAP device driver, 1.6
[    2.240181] tun: (C) 1999-2004 Max Krasnyansky <maxk@qualcomm.com>
[    2.247334] PPP generic driver version 2.4.2
[    2.252456] PPP BSD Compression module registered
[    2.257749] PPP Deflate Compression module registered
[    2.264474] PPP MPPE Compression module registered
[    2.269867] NET: Registered protocol family 24
[    2.274932] PPTP driver version 0.8.5
[    2.279404] ehci_hcd: USB 2.0 'Enhanced' Host Controller (EHCI) Driver
[    2.306869] sunxi-ehci sunxi-ehci.1: SW USB2.0 'Enhanced' Host Controller (EHCI) Driver
[    2.315931] sunxi-ehci sunxi-ehci.1: new USB bus registered, assigned bus number 1
[    2.325702] sunxi-ehci sunxi-ehci.1: irq 104, io mem 0xf1c1a000
[    2.350049] sunxi-ehci sunxi-ehci.1: USB 0.0 started, EHCI 1.00
[    2.357513] hub 1-0:1.0: USB hub found
[    2.361794] hub 1-0:1.0: 1 port detected
[    2.366660] ohci_hcd: USB 1.1 'Open' Host Controller (OHCI) Driver
[    2.393776] sunxi-ohci sunxi-ohci.1: SW USB2.0 'Open' Host Controller (OHCI) Driver
[    2.402427] sunxi-ohci sunxi-ohci.1: new USB bus registered, assigned bus number 2
[    2.410932] sunxi-ohci sunxi-ohci.1: irq 105, io mem 0xf1c1a400
[    2.474643] hub 2-0:1.0: USB hub found
[    2.478894] hub 2-0:1.0: 1 port detected
[    2.483976] usbcore: registered new interface driver usbserial
[    2.490523] usbserial: USB Serial Driver core
[    2.495475] usbcore: registered new interface driver option
[    2.501835] USB Serial support registered for GSM modem (1-port)
[    2.509014] file system registered
[    2.514867] android_usb gadget: Mass Storage Function, version: 2009/09/11
[    2.522582] android_usb gadget: Number of LUNs=3
[    2.527852]  lun0: LUN: removable file: (no medium)
[    2.533340]  lun1: LUN: removable file: (no medium)
[    2.538902]  lun2: LUN: removable file: (no medium)
[    2.544772] get usb_serial_number success from boot command line
[    2.551420] android_usb gadget: android_usb ready
[    2.557476] mousedev: PS/2 mouse device common for all mice
[    2.564663] sunxi-rtc sunxi-rtc: rtc core: registered sunxi-rtc as rtc0
[    2.572237] sunxi cedar version 0.1
[    2.576328] [cedar]: install start!!!
[    2.580858] [cedar]: install end!!!
[    2.589586] device-mapper: ioctl: 4.22.0-ioctl (2011-10-19) initialised: dm-devel@redhat.com
[    2.599569] axp22_dcdc3: Failed to create debugfs directory
[    2.608261] [mmc]: SD/MMC/SDIO Host Controller Driver(v1.122 2016-09-21 09:48) Compiled in Feb 19 2021 at 19:26:12
[    2.619871] [mmc]: get mmc1's sdc_power failed
[    2.624952] [mmc]: get mmc2's sdc_power failed
[    2.629931] [mmc]: get mmc2's 2xmode ok, val = 1
[    2.635118] [mmc]: MMC host used card: 0x6, boot card: 0x4, io_card 2
[    2.643365] [mmc]: sdc2 set ios: clk 0Hz bm OD pm OFF vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.654345] [mmc]: sdc2 set ios: clk 0Hz bm PP pm UP vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.664383] [mmc]: sdc1 set ios: clk 0Hz bm OD pm OFF vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.665594] [mmc]: sdc2 power_supply is null
[    2.680037] [mmc]: sdc2 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.682555] usbcore: registered new interface driver usbhid
[    2.682563] usbhid: USB HID core driver
[    2.682571] zram: num_devices not specified. Using default: 1
[    2.682577] zram: Creating 1 devices ...
[    2.711878] ashmem: initialized
[    2.715568] logger: created 256K log 'log_main'
[    2.720891] logger: created 256K log 'log_events'
[    2.726285] logger: created 256K log 'log_radio'
[    2.730864] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 52,  RTO !!
[    2.731723] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 52,  RTO !!
[    2.731755] [mmc]: sdc2 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.734257] [mmc]: sdc2 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.736176] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 8,  RTO !!
[    2.736202] *******************Try sdio*******************
[    2.737031] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 5,  RTO !!
[    2.737058] mmc0: req failed (CMD5): -110, retrying...
[    2.737886] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 5,  RTO !!
[    2.737910] mmc0: req failed (CMD5): -110, retrying...
[    2.738738] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 5,  RTO !!
[    2.738764] mmc0: req failed (CMD5): -110, retrying...
[    2.739591] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 5,  RTO !!
[    2.739616] *******************Try sd *******************
[    2.740446] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 55,  RTO !!
[    2.741294] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 55,  RTO !!
[    2.742139] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 55,  RTO !!
[    2.742984] [mmc]: *** sunxi_mci_dump_errinfo(L915): smc 2 err, cmd 55,  RTO !!
[    2.743009] *******************Try mmc*******************
[    2.743021] [mmc]: sdc2 set ios: clk 400000Hz bm OD pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.743460] [mmc]: sdc2 set ios: clk 400000Hz bm OD pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.743562] [mmc]: sdc2 set ios: clk 400000Hz bm OD pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.743662] [mmc]: sdc2 set ios: clk 400000Hz bm OD pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.746155] [mmc]: sdc2 set ios: clk 400000Hz bm OD pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.761273] [mmc]: sdc2 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.775230] [mmc]: sdc2 set ios: clk 400000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.775681] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.775791] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.775888] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.775982] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.776075] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.776165] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.776252] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.776338] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing LEGACY(SDR12) dt B
[    2.776426] [mmc]: sdc2 set ios: clk 25000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.776493] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.776585] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.776673] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.776760] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.776847] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.776934] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.777021] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.777107] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.777195] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 1 timing MMC-HS(SDR20) dt B
[    2.777283] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.779402] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.779496] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.779590] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.779684] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.779777] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.779880] mmc0: new high speed MMC card at address 0001
[    2.780383] mmcblk0: mmc0:0001 TB2816 14.6 GiB
[    2.780585] mmcblk0boot0: mmc0:0001 TB2816 partition 1 4.00 MiB
[    2.780775] mmcblk0boot1: mmc0:0001 TB2816 partition 2 4.00 MiB
[    2.782665]  mmcblk0: p1 p2 p3 < p5 p6 p7 p8 p9 p10 p11 p12 p13 p14 p15 p16 >
[    2.782715] mmcblk0: p1 size 24403968 extends beyond EOD, truncated
[    2.786201] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.786332] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.786417] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.786512] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.786606] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.787995]  mmcblk0boot1: unknown partition table
[    2.788653] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.788760] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.788855] [mmc]: sdc2 set ios: clk 50000000Hz bm PP pm ON vdd 3.3V width 8 timing MMC-HS(SDR20) dt B
[    2.789804]  mmcblk0boot0: unknown partition table
[    2.790075] *******************mmc init ok *******************
[    2.837016] logger: created 256K log 'log_system'
[    3.343965] Linux telephony interface: v1.00
[    3.348951] sunxi_oops: heming add OOPS_INFO_ADDR = -20
[    3.354822] Initializing buzzer device .
[    3.359269] axp22_dldo4: Failed to create debugfs directory
[    3.365712] BYTRON_Buzzer_request pwm 1 success!
[    3.370948] BYTRON_Buzzer_Set_Polarity pwm 1, active low
[    3.376960] BYTRON_Buzzer_Config pwm 1, <128 / 166667>
[    3.382995] buzzer_create_proc.
[    3.386651] Succedded to initialize buzzer device.
[    3.393370] [ audio ] err:try to get audio_pa_ctrl failed!
[    3.399514] sunxi-pcm-codec: probe of sunxi-pcm-codec failed with error -14
[    3.408481] [I2S0]sunxi-i2s0 cannot find any using configuration for controllers, return directly!
[    3.418763] [I2S]sndi2s0 cannot find any using configuration for controllers, return directly!
[    3.428478] [I2S0] driver not init,just return.
[    3.433568] [I2S1]sunxi-i2s1 cannot find any using configuration for controllers, return directly!
[    3.443804] [I2S]sndi2s1 cannot find any using configuration for controllers, return directly!
[    3.453522] I2S1 driver not init,just return.
[    3.458589] u32 classifier
[    3.461673]     Actions configured
[    3.465505] Netfilter messages via NETLINK v0.30.
[    3.470939] nf_conntrack version 0.5.0 (16048 buckets, 64192 max)
[    3.478222] ctnetlink v0.93: registering with nfnetlink.
[    3.484342] NF_TPROXY: Transparent proxy support initialized, version 4.1.0
[    3.492191] NF_TPROXY: Copyright (c) 2006-2007 BalaBit IT Ltd.
[    3.499157] xt_time: kernel timezone is -0000
[    3.504230] IPv4 over IPv4 tunneling driver
[    3.509479] gre: GRE over IPv4 demultiplexor driver
[    3.514969] ip_gre: GRE over IPv4 tunneling driver
[    3.521078] ip_tables: (C) 2000-2006 Netfilter Core Team
[    3.527210] arp_tables: (C) 2002 David S. Miller
[    3.532477] TCP: cubic registered
[    3.536210] Initializing XFRM netlink socket
[    3.541333] NET: Registered protocol family 10
[    3.547567] Mobile IPv6
[    3.550412] ip6_tables: (C) 2000-2006 Netfilter Core Team
[    3.556632] IPv6 over IPv4 tunneling driver
[    3.562476] NET: Registered protocol family 17
[    3.567488] NET: Registered protocol family 15
[    3.572516] L2TP core driver, V2.0
[    3.576426] PPPoL2TP kernel driver, V2.0
[    3.580847] L2TP IP encapsulation support (L2TPv3)
[    3.586285] L2TP netlink interface
[    3.590228] L2TP ethernet pseudowire support (L2TPv3)
[    3.596244] ThumbEE CPU extension supported.
[    3.601134] Registering SWP/SWPB emulation handler
[    3.608123] otg_wakelock_init: No USB transceiver found
[    3.614009] ****************************************************************
[    3.621961] =====ctp_fetch_sysconfig_para=====.
[    3.627142] ctp_fetch_sysconfig_para: ctp_power_io script_get_item err.
[    3.634703] ctp_irq gpio number is 357
[    3.638933] axp22_ldoio1: Failed to create debugfs directory
[    3.660083] it7259_detect: addr= 46
[    3.664137] -------it7259_ts_probe---in------!
[    3.681409] it7259 0-0046: it7259_ts_chip_identify read id: 0A ITE7259 20
[    3.892628] it7259 0-0046: Current fw{3.2.4.5} cfg{E.A7.7.F}
[    3.899065] Execute Upgrade_FW_CFG()
[    3.903159] open /system/etc/firmware/it7259.fw failed
[    3.909003] it7259 0-0046: failed to upgrade firmware
[    3.950100] i2c 0-0046: Driver it7259 requests probe deferral
[    3.956536] ****************************************************************
[    3.964515] sunxi-rtc sunxi-rtc: setting system clock to 1970-01-10 04:24:52 UTC (793492)
[    3.973749] ths_fetch_sysconfig_para: type err  device_used = 1.
[    3.980605] ths_fetch_sysconfig_para: type err ths_trip1_3 = 110.
[    3.987573] ths_fetch_sysconfig_para: type err ths_trip1_4 = 110.
[    3.994484] ths_fetch_sysconfig_para: type err ths_trip1_5 = 110.
[    4.001465] ths_fetch_sysconfig_para: type err ths_trip1_6 = 110.
[    4.008433] ths_fetch_sysconfig_para: type err ths_trip1_7 = 110.
[    4.015350] ths_fetch_sysconfig_para: type err ths_trip1_3_min = 0.
[    4.022521] ths_fetch_sysconfig_para: type err ths_trip1_3_max = 0.
[    4.029610] ths_fetch_sysconfig_para: type err ths_trip1_4_min = 0.
[    4.036782] ths_fetch_sysconfig_para: type err ths_trip1_4_max = 0.
[    4.044034] ths_fetch_sysconfig_para: type err ths_trip1_5_min = 0.
[    4.051217] ths_fetch_sysconfig_para: type err ths_trip1_5_max = 0.
[    4.058308] ths_fetch_sysconfig_para: type err ths_trip1_6_min = 0.
[    4.065481] ths_fetch_sysconfig_para: type err ths_trip1_6_max = 0.
[    4.072651] ths_fetch_sysconfig_para: type err ths_trip2_count = 0.
[    4.079739] ths_fetch_sysconfig_para: type err ths_trip2_0 = 0.
[    4.087159] sunxi_cpu_budget_vftable_init: support only one vf_table
[    4.094739] CPU Budget:Register notifier
[    4.099218] CPU Budget:register Success
[    4.103554] sunxi-budget-cooling sunxi-budget-cooling: Cooling device registered: thermal-budget-0
[    4.113663] -------it7259_ts_probe---in------!
[    4.117798] =========GPS========= :gsp not used in configuration
[    4.117812] ALSA device list:
[    4.117818]   No soundcards found.
[    4.133084] Freeing init memory: 316K
[    4.140200] init: init started!
[    4.149940] SELinux: 2048 avtab hash slots, 5121 rules.
[    4.155974] SELinux:  Android master kernel running Android M policy in compatibility mode.
[    4.161507] it7259 0-0046: it7259_ts_chip_identify read id: 0A ITE7259 20
[    4.176024] SELinux: 2048 avtab hash slots, 5121 rules.
[    4.181952] SELinux:  1 users, 2 roles, 544 types, 0 bools, 1 sens, 1024 cats
[    4.190118] SELinux:  87 classes, 5121 rules
[    4.197396] SELinux:  Completing initialization.
[    4.202626] SELinux:  Setting up existing superblocks.
[    4.208479] SELinux: initialized (dev sysfs, type sysfs), uses genfs_contexts
[    4.216556] SELinux: initialized (dev rootfs, type rootfs), uses genfs_contexts
[    4.224818] SELinux: initialized (dev bdev, type bdev), not configured for labeling
[    4.233455] SELinux: initialized (dev proc, type proc), uses genfs_contexts
[    4.241256] SELinux: initialized (dev tmpfs, type tmpfs), uses transition SIDs
[    4.249401] SELinux: initialized (dev devtmpfs, type devtmpfs), uses transition SIDs
[    4.258769] SELinux: initialized (dev debugfs, type debugfs), uses genfs_contexts
[    4.283654] SELinux: initialized (dev sockfs, type sockfs), uses task SIDs
[    4.291465] SELinux: initialized (dev pipefs, type pipefs), uses task SIDs
[    4.299214] SELinux: initialized (dev anon_inodefs, type anon_inodefs), not configured for labeling
[    4.309340] SELinux: initialized (dev devpts, type devpts), uses transition SIDs
[    4.317706] SELinux: initialized (dev selinuxfs, type selinuxfs), uses genfs_contexts
[    4.326600] SELinux: initialized (dev tmpfs, type tmpfs), uses transition SIDs
[    4.334698] SELinux: initialized (dev sysfs, type sysfs), uses genfs_contexts
[    4.372638] it7259 0-0046: Current fw{3.2.4.5} cfg{E.A7.7.F}
[    4.379084] Execute Upgrade_FW_CFG()
[    4.383271] open /system/etc/firmware/it7259.fw failed
[    4.389116] it7259 0-0046: failed to upgrade firmware
[    4.430118] i2c 0-0046: Driver it7259 requests probe deferral
[    4.558199] type=1403 audit(793493.080:2): policy loaded auid=4294967295 ses=4294967295
[    4.567862] init: (Initializing SELinux non-enforcing took 0.42s.)
[    4.584123] init: init second stage started!
[    4.630687] init: waitpid failed: No child processes
[    4.636736] init: (Loading properties from /default.prop took 0.00s.)
[    4.646632] init: (Parsing /init.environ.rc took 0.00s.)
[    4.653013] init: (Parsing /init.usb.rc took 0.00s.)
[    4.659622] init: (Parsing init.sensors.rc took 0.00s.)
[    4.665529] init: (Parsing init.common.rc took 0.01s.)
[    4.671487] init: (Parsing init.sun8i.common.rc took 0.00s.)
[    4.677922] init: (Parsing init.sun8i.usb.rc took 0.00s.)
[    4.684066] init: (Parsing /init.sun8i.rc took 0.03s.)
[    4.690417] init: (Parsing /init.usb.configfs.rc took 0.00s.)
[    4.697036] init: (Parsing /init.zygote32.rc took 0.00s.)
[    4.703238] init: (Parsing /init.trace.rc took 0.00s.)
[    4.709072] init: (Parsing /init.rc took 0.06s.)
[    4.714501] init: SELinux: Could not get canonical path /adb_keys restorecon: No such file or directory.
[    4.725230] init: Starting service 'ueventd'...
[    4.731159] init: Waiting for /dev/.coldboot_done...
[    4.734176] ueventd: ueventd started!
[    4.810044] WRN:L2847(drivers/usb/sunxi_usb/udc/sunxi_udc.c):pdev is null
[    5.190701] ueventd: Coldboot took 0.45s.
[    5.195331] init: Waiting for /dev/.coldboot_done took 0.46s.
[    5.201940] init: /dev/hw_random not found
[    5.320212] SELinux: initialized (dev cgroup, type cgroup), uses genfs_contexts
[    5.329080] SELinux: initialized (dev tmpfs, type tmpfs), uses transition SIDs
[    5.339161] SELinux: initialized (dev tmpfs, type tmpfs), uses transition SIDs
[    5.351233] init: write_file: Unable to open '/proc/sys/kernel/hung_task_timeout_secs': No such file or directory
[    5.362903] init: write_file: Unable to open '/proc/sys/kernel/sched_tunable_scaling': No such file or directory
[    5.374349] init: write_file: Unable to open '/proc/sys/kernel/sched_latency_ns': No such file or directory
[    5.385310] init: write_file: Unable to open '/proc/sys/kernel/sched_wakeup_granularity_ns': No such file or directory
[    5.397260] init: write_file: Unable to open '/proc/sys/kernel/sched_compat_yield': No such file or directory
[    5.470163] SELinux: initialized (dev cgroup, type cgroup), uses genfs_contexts
[    5.478636] init: write_file: Unable to write to '/dev/cpuctl/cpu.shares': Invalid argument
[    5.550204] SELinux: initialized (dev cgroup, type cgroup), uses genfs_contexts
[    5.561550] init: write_file: Unable to open '/proc/sys/abi/swp': No such file or directory
[    5.572016] SELinux: initialized (dev tmpfs, type tmpfs), uses transition SIDs
[    5.580597] init: /dev/hw_random not found
[    5.585274] init: Starting service 'charger'...
[    5.595173] charger:
[    5.597844] charger: *************** LAST KMSG ***************
[    5.604592] charger:
[    5.608105] charger: last_kmsg not found. Cold reset?
[    5.614011] charger:
[    5.616673] charger: ************* END LAST KMSG *************
[    5.623466] charger:
[    5.626118] charger: --------------- STARTING CHARGER MODE ---------------
[    5.681563] [DISP]disp_module_init
[    5.686272] [DISP]disp_probe
[    5.700384] [DISP] *****************************************************************
[    5.709166] [DISP] ***
[    5.711956] [DISP] *** LCD Panel Parameter Check
[    5.717210] [DISP] ***
[    5.719967] [DISP] ***             by guozhenjie
[    5.725305] [DISP] ***
[    5.728063] [DISP] *****************************************************************
[    5.736859] [DISP] ***
[    5.739714] [DISP] *** Interface:
[    5.743354] [DISP] *** 16Bit CPU Panel
[    5.747989] [DISP] *** Lcd Frm to RGB565
[    5.752490] [DISP] ***
[    5.755344] [DISP] *** Timing:
[    5.758868] [DISP] *** lcd_x:      240
[    5.763302] [DISP] *** lcd_y:      400
[    5.767603] [DISP] *** lcd_ht:     300
[    5.771940] [DISP] *** lcd_hbp:    20
[    5.776218] [DISP] *** lcd_vt:     3000
[    5.780630] [DISP] *** lcd_vbp:    20
[    5.784831] [DISP] *** lcd_hspw:   10
[    5.789099] [DISP] *** lcd_vspw:   10
[    5.793314] [DISP] *** lcd_frame_frq:  10Hz
[    5.798087] [DISP] ***
[    5.801028] [DISP] *** WRN03: Recommend "lcd_dclk_frq = 54"
[    5.807337] [DISP] ***
[    5.810205] [DISP] *** LCD Panel Parameter Check End
[    5.815909] [DISP] *****************************************************************
[    5.825393] [DISP]Fb_Init
[    5.828506] [DISP] parser_disp_init_para,line:130:    fetch script data disp_init.screen2_output_type fail
[    5.839361] [DISP] parser_disp_init_para,line:147:    fetch script data disp_init.screen2_output_mode fail
[    5.850289] [DISP] parser_disp_init_para,line:208:    fetch script data disp_init.fb2_format fail
[    5.860327] [DISP] parser_disp_init_para,line:213:    fetch script data disp_init.fb2_scaler_mode_enable fail
[    5.871520] [DISP] parser_disp_init_para,line:218:    fetch script data disp_init.fb2_width fail
[    5.881462] [DISP] parser_disp_init_para,line:223:    fetch script data disp_init.fb2_height fail
[    5.899779] [DISP]disp_probe finish
[    5.903821] -------it7259_ts_probe---in------!
[    5.903915] [DISP]capture_module_init
[    5.904468] [DISP]capture_probe
[    5.904558] [DISP]capture finish
[    5.904564] [DISP]disp_module_init finish
```
