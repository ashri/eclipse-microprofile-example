# Experimenting with Eclipse Microprofile Configuration

This repository contains a super simple JAX-RS application to use in testing the
[Eclipse Microprofile Config][mpconfig] library.

The implementation of the Microprofile Config API is the current version of the
[Geronimo component][impl] found in the Apache Subversion repository. 

To get it running:

1. Check out the config implementation and ensure it builds and is installed to
   your local Maven repository
2. Build this module: `mvn clean package`
3. Deploy the `mpconfig.war` file to a JavaEE 7 compliant app server like [TomEE][tomee] or
[Payara][payara].

[mpconfig]: https://github.com/eclipse/microprofile-config
[impl]: https://svn.apache.org/repos/asf/geronimo/components/config/trunk/
[tomee]: https://tomee.apache.org
[payara]: https://www.payara.fish