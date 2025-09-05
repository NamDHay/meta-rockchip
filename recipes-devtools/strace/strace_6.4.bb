SUMMARY = "System call tracing tool"
HOMEPAGE = "http://strace.io"
DESCRIPTION = "strace is a diagnostic, debugging and instructional userspace utility for Linux. It is used to monitor and tamper with interactions between processes and the Linux kernel, which include system calls, signal deliveries, and changes of process state."
SECTION = "console/utils"
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=59a33f0a3e6122d67c0b3befccbdaa6b"

SRC_URI = "https://github.com/strace/strace/releases/download/v6.4/strace-6.4.tar.xz"
SRC_URI[sha256sum] = "27987dbac57fdfd260c6db4dc8328df35c95c6867c8a3d4371d59cdcf4eb9238"

inherit autotools

