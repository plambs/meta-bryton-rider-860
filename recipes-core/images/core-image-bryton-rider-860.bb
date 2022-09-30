# Base this image on core-image-base
require recipes-core/images/core-image-base.bb

IMAGE_FEATURES += "debug-tweaks"
IMAGE_FEATURES += "ssh-server-openssh"

IMAGE_INSTALL += "wayland weston"
IMAGE_INSTALL += "bryton860-core"
