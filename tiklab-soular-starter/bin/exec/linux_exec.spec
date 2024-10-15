
%define app_name tiklab-matflow
%define app_version 1.0.2
%define tar_file %{app_name}-%{app_version}.tar.gz
%define install_dir /opt/%{app_name}

Name: %{app_name}
Version: %{app_version}
Release: 1
Summary: A description of your package
License: GPL
Group: Applications/System
Source0: %{tar_file}

%global _missing_build_ids_terminate_build 0

%description
A description of your package.

%prep
%setup -q

%build
# Add any build instructions here

%install
# Create necessary directories
mkdir -p %{buildroot}%{install_dir}

# Copy files to the installation directory

mv * %{buildroot}%{install_dir}
strip %{buildroot}%{install_dir}/embbed/jdk-16.0.2/bin/*
#strip %{buildroot}/embbed/jdk-16.0.2/lib/*
strip %{buildroot}%{install_dir}/embbed/jdk-16.0.2/lib/jexec
strip %{buildroot}%{install_dir}/embbed/jdk-16.0.2/lib/jspawnhelper
strip %{buildroot}%{install_dir}/embbed/jdk-16.0.2/lib/*.so
strip %{buildroot}%{install_dir}/embbed/jdk-16.0.2/lib/server/*

%files
# List all files to be included in the package here
%{install_dir}/*
# /lib/*
# /plugin/*
# /conf/*
# /embbed/*
# /version


%changelog
# Add changelog entries here


