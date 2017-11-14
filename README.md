# rcode

Use [Rserve for running R scripts](http://www.rforge.net/Rserve/index.html)

Docker [container for running Rserve](https://github.com/stevenpollack/docker-rserve)

### How to run Rserve
`docker run -p 6311:6311 -v {project path}/src/main/resources:/data stevenpollack/docker-rserve`