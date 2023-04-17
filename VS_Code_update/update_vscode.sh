#!/bin/bash

# Check for updates
echo "Checking for updates..."
latest_version=$(curl -s https://api.github.com/repos/microsoft/vscode/releases/latest | grep -oP '"tag_name": "\K(.*)(?=")')
current_version=$(code --version | grep -oP '\d+\.\d+\.\d+')

if [[ "$latest_version" == "$current_version" ]]; then
    echo "You are already on the latest version of VSCode ($current_version)."
    exit 0
else
    echo "A new version of VSCode ($latest_version) is available. Updating..."
    # Download the latest release archive
    wget https://github.com/microsoft/vscode/archive/$latest_version.tar.gz

    # Extract the archive
    tar -xzf $latest_version.tar.gz

    # Change directory to the extracted folder
    cd vscode-$latest_version

    # Build and install VSCode
    yarn
    yarn run compile
    yarn run watch
    yarn run vscode
fi

echo "Update complete. Please restart VSCode to use the latest version."
