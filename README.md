# IF1007 - Tópicos Avançados em Sistemas de Informação 4

Desenvolvimento de Aplicações com Arquitetura Baseada em Microservices

![IF1007](/if1007-microservices-icon.png)

## Sistemas de Informação, [Centro de Informática](http://www.cin.ufpe.br), ([UFPE](http://www.ufpe.br))

### Instrutores

* **Professor** Vinicius Cardoso Garcia ([vcg@cin.ufpe.br](mailto:vcg@cin.ufpe.br))

### Local

* Centro de Informática, horários: **segunda (17:00-18:40)** e **quarta (18:50-20:30)**, sala **E-112**.
* Canal de comunicação oficial no [Slack](http://if1007-2018-1.slack.com)
* Aulas práticas, quando ocorrerem, serão no **Lab G2** (preferencialmente).

### Edições passadas

* [Semestre 2018.1](https://github.com/IF1007/if1007/releases/tag/if1007-2018-1)

### Comunicação

- Temos um canal no Telegram para uma comunicação mais dinâmica: [Reliability Engineering Group Channel](https://t.me/regcin)

### Ementa

Microservice é um estilo e padrão de arquitetura de software em que sistemas complexos são decompostos em serviços menores que trabalham em conjunto para formar serviços maiores. Os Microservices são serviços autônomos, independentes e independentemente implantáveis. No mundo de hoje, muitas empresas usam microservices como principal padrão para a construção de aplicativos corporativos grandes e orientados a serviços.

O framework [Spring](https://spring.io) é um framework de programação popular com a comunidade de desenvolvedores por muitos anos. O [Spring Boot](https://projects.spring.io/spring-boot/) removeu a necessidade de ter um conteiner leve de aplicação e forneceu um meio para implantar aplicativos leves e sem servidor. O [Spring Cloud](https://projects.spring.io/spring-cloud/) combina muitos componentes e junto com o [OSS Netflix](https://netflix.github.io/) e fornece um ecossistema para executar e gerenciar microservices em grande escala. Ele fornece recursos como balanceamento de carga, registro de serviço, monitoramento, gateway de serviço e assim por diante.

No entanto, os microservices vêm com seus próprios desafios, como monitoramento, gerenciamento, distribuição, dimensionamento, descoberta, etc., especialmente quando se implanta em escala. A adoção de microservices sem abordar os desafios dos microservices comuns levaria a resultados catastróficos. A parte mais importante deste curso é discutir um modelo de capacidade de microservice agnóstico em termos de tecnologia que busca ajudar a resolver os desafios mais comuns do mundo de microservice.

### Bibliografia Sugerida

Não há livro texto obrigatório. Entretanto, a seguir estão alguns livros que podem ser recomendados:

- [Building Microservices: Designing Fine-Grained Systems](https://www.amazon.com/Building-Microservices-Designing-Fine-Grained-Systems/dp/1491950358)
- X. Larrucea, I. Santamaria, R. Colomo-Palacios and C. Ebert, "**Microservices**," in IEEE Software, vol. 35, no. 3, pp. 96-100, May/June 2018. doi: [10.1109/MS.2018.2141030](http://ieeexplore.ieee.org/stamp/stamp.jsp?tp=&arnumber=8354423&isnumber=8354413)
- P. Jamshidi, C. Pahl, N. C. Mendonça, J. Lewis and S. Tilkov, "[Microservices: The Journey So Far and Challenges Ahead](https://ieeexplore.ieee.org/document/8354433/)," in IEEE Software, vol. 35, no. 3, pp. 24-35, May/June 2018. doi: 10.1109/MS.2018.2141039
- [The Architecture of Open Source Applications](http://www.aosabook.org/en/index.html)

### Bibliografia Complementar

- [Spring Microservices](https://www.packtpub.com/application-development/spring-microservices)
- [Spring Boot: Acelere o desenvolvimento de microsserviços](https://www.casadocodigo.com.br/products/livro-spring-boot)
- [Microservices for Java Developers A Hands-on Introduction to Frameworks and Containers](https://developers.redhat.com/promotions/microservices-for-java-developers/)
- [Migrating to Cloud-Native Application Architectures](http://www.oreilly.com/programming/free/migrating-cloud-native-application-architectures.csp)
- [Continous Integration](https://www.amazon.com/Continuous-Integration-Improving-Software-Reducing/dp/0321336380)
- [The Phoenix Project: A Novel about IT, DevOps, and Helping Your Business Win](https://www.amazon.com.br/Phoenix-Project-DevOps-Helping-Business-ebook/dp/B078Y98RG8?gclid=EAIaIQobChMIpZns27OZ2wIVBorICh1yxQepEAAYASAAEgJiKvD_BwE&hvadid=173522634457&hvdev=c&hvlocphy=9074122&hvnetw=g&hvpos=1t1&hvqmt=b&hvrand=14851331746735633798&hvtargid=kwd-826183570&keywords=the+phoenix+project&qid=1526995019&sr=1-1&tag=hydrbrgk-20&ref=sr_1_1)

### Bibliografia sobre Ferramentas, Frameworks e Tecnologias

- [Pattern: Monolithic Architecture](http://microservices.io/patterns/monolithic.html)
- [Pattern: Microservice Architecture](http://microservices.io/patterns/microservices.html)
- [Introduction to Microservices](https://www.nginx.com/blog/introduction-to-microservices/), this is a seven‑part series of articles
- [How to Write Great API Documentation Every Time](https://hackernoon.com/how-to-write-great-api-documentation-every-time-8f7e001a9d7c)
- [Layering Microservices](http://philcalcado.com/2018/09/24/services_layers.html)
- Spring IO
  - Spring IO Website: http://www.spring.io
  - Spring Boot: https://projects.spring.io/spring-boot/
  - Spring Cloud: https://projects.spring.io/spring-cloud/
  - Spring Projects: http://spring.io/projects
  - Spring Guides: http://spring.io/guides
  - Spring Document: http://spring.io/guides
  - Spring Boot Docs: http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/
  - Spring Boot API: http://docs.spring.io/spring-boot/docs/current/api/
- Stay Connected
  - Twitter: http://twitter.com/springcentral
  - YouTube: http://spring.io/video
  - Questions: http://spring.io/questions
  - JIRA: http://jira.spring.io
  - Blog: http://spring.io/blog
- Help
  - Stack Overflow: http://stackoverflow.com/questions/tagged/spring-boot
- [Netflix Open Source Software Center](https://netflix.github.io/)
- [The InfoQ eMag: Microservices vs. Monoliths - The Reality Beyond the Hype](https://www.infoq.com/minibooks/emag-microservices-monoliths)
- [The cloud native application: Microservices with Spring Boot and Spring Cloud](https://www.infoq.com/br/presentations/the-cloud-native-application-microservices-with-spring-boot-and-spring-cloud)
- [Production-Ready Microservices - Building Standardized Systems Across an Engineering Organization](http://shop.oreilly.com/product/0636920053675.do)
- [Microservices vs. Service-Oriented Architecture](https://www.nginx.com/resources/library/microservices-vs-soa/)
- [Canary deployments, A/B testing, and microservices with Ambassador](https://www.datawire.io/faster/canary-workflow/)
- [Systems Performance: Enterprise and the Cloud](http://www.brendangregg.com/sysperfbook.html)
- [Designing Data-Intensive Applications](http://www.dataintensive.net/)
- [Continous Delivery](http://www.continuousdelivery.com)
- [The Evolution of DevSecOps Revisited](https://cloudsentry.evident.io/evolution-devsecops-revisited/)
- [Containers com Docker: Do desenvolvimento à produção](https://www.casadocodigo.com.br/products/livro-docker)
- [Ansible: Up and Running](http://www.ansiblebook.com/)
- [Docker Tutorials and Labs](https://github.com/docker/labs) (This repo contains Docker labs and tutorials authored both by Docker, and by members of the community)
- [Mike Coleman (Docker Employee) "Docker for the Virtualization Admin" eBook](https://github.com/mikegcoleman/docker101/blob/master/Docker_eBook_Jan_2017.pdf)
- [Entrega contínua em Android: Como automatizar a distribuição de apps](https://www.casadocodigo.com.br/products/livro-entrega-continua-android)
- [Jenkins: Automatize tudo sem complicações](https://www.casadocodigo.com.br/products/livro-jenkins)
- [Testes automatizados de software: Um guia prático](https://www.casadocodigo.com.br/products/livro-testes-de-software)
- [Test-Driven Development: Teste e Design no Mundo Real](https://www.casadocodigo.com.br/products/livro-tdd)
- [Cloud Computing: Concepts, Technology & Architecture](http://www.amazon.com/Cloud-Computing-Practice-Dan-Marinescu/dp/0124046274)
- [Four Layers of TCP/IP model, Comparison and Difference between TCP/IP and OSI models](http://www.omnisecu.com/tcpip/tcpip-model.php)
- [Travis CI](https://travis-ci.org/), Test and Deploy with Confidence
- [From open source to sustainable success: the Kubernetes graduation story](http://cloudplatform.googleblog.com/2018/03/from-open-source-to-sustainable-success-the-Kubernetes-graduation-story.html)
- [Kubernetes Ingress: NodePort, Load Balancers, and Ingress Controllers](https://blog.getambassador.io/kubernetes-ingress-nodeport-load-balancers-and-ingress-controllers-6e29f1c44f2d)
- [Kubernetes best practices: Resource requests and limits](https://cloudplatform.googleblog.com/2018/05/Kubernetes-best-practices-Resource-requests-and-limits.html)
- [Package Management Basics: apt, yum, dnf, pkg (by Digital Ocean](https://www.digitalocean.com/community/tutorials/package-management-basics-apt-yum-dnf-pkg)

### Blogs, Disciplinas, Treinamentos

- [12 Fractured Apps](https://medium.com/@kelseyhightower/12-fractured-apps-1080c73d481c)
- [The twelve-factor app](https://12factor.net/)
- [What’s a service mesh? And why do I need one?](https://blog.buoyant.io/2017/04/25/whats-a-service-mesh-and-why-do-i-need-one/)
- [The Google Cloud Developer Cheat Sheet](https://medium.com/google-cloud/the-google-cloud-developer-cheat-sheet-429775bd6d11?_lrsc=d1590800-bec4-4e82-9240-4e63d7ccbb77)
- [Angular Libraries and Microservices](https://antoniogoncalves.org/2018/08/13/angular-libraries-and-microservices/)
- [Principles of Container-based Application Design](http://blog.kubernetes.io/2018/03/principles-of-container-app-design.html)
- [Hands on Lab Overview: DevOps Cloud Native Microservices Development - YouTube](https://www.youtube.com/playlist?list=PLPIzp-E1msrZhDmRUnNBSYY6LJ2yWh3Ro)
- [Microservices for Digital Transformation - case studies across ERP, Entertainment, Finance, Search, Auctions, and Cloud Industries](https://www.linkedin.com/pulse/microservices-digital-transformation-case-studies-erp-yerramsetti/)
- [Why Microservices Should Be Event Driven: Autonomy vs Authority](http://blog.christianposta.com/microservices/why-microservices-should-be-event-driven-autonomy-vs-authority/)
- [3 Easy Things to Do to Make Your Microservices More Resilient](http://blog.christianposta.com/microservices/3-easy-things-to-do-to-make-your-microservices-more-resilient/)
- [The Hardest Part About Microservices: Your Data](http://blog.christianposta.com/microservices/the-hardest-part-about-microservices-data/)
- [Carving the Java EE Monolith Into Microservices: Prefer Verticals Not Layers](https://developers.redhat.com/blog/2016/07/07/carving-the-java-ee-monolith-into-microservices-prefer-verticals-not-layers/)
- [Microservices - Organizing Large Teams for Rapid Delivery](https://www.infoq.com/presentations/microservices-team-organization)
- [The Journey from Monolith to Microservices - A Guided Adventure](https://www.infoq.com/presentations/journey-monolith-microservices)
- [Simon Brown on the Role of the Software Architect in a Continuous Delivery Environment](https://www.infoq.com/podcasts/simon-brown-architecture)
- [Microserviços na prática: o que aprendemos em 2 anos](https://www.infoq.com/br/presentations/microservicos-na-pratica-o-que-aprendemos-em-2-anos)
- [MicroProfile: uma nova forma de desenvolver aplicações corporativas na era dos microservices](https://www.infoq.com/br/presentations/microprofile-uma-nova-forma-de-desenvolver-aplicacoes-corporativas)
- [Desenvolvendo, expandindo e amadurecendo a prática de Engenharia de Caos](https://www.infoq.com/br/articles/engenharia-de-caos)
- [Cinco coisas que todo desenvolvedor de software deve saber sobre Arquitetura de Software](https://www.infoq.com/br/articles/architecture-five-things)
- [9 perguntas frequentes sobre REST](https://www.infoq.com/br/articles/9-perguntas-frequentes-sobre-rest)
- [IF1006 - TÓPICOS AVANÇADOS EM SISTEMAS DE INFORMAÇÃO 3 (SERVIÇOS E INFRAESTRUTURA DE NUVEM) - 2017.1](http://bit.ly/IF1006-2017-1)
- [IF1004 - Seminários em Sistemas de Informação 3 (Desmistificando DevOps: Projetando Arquiteturas Efetivamente Escaláveis)](https://github.com/vinicius3w/if1004-DevOps)
- [De monolítico a cloud native: uma jornada de erros e acertos na Wine.com.br](https://www.infoq.com/br/presentations/de-monolitico-a-cloud-native-uma-jornada-de-erros-e-acertos)
- [Who monitors the monitoring systems?](https://medium.com/@adrianco/who-monitors-the-monitoring-systems-715a333f97fc)
- AWS
  - [DevOps | AWS Cloud | Cloud Tutorials for Beginners](https://www.youtube.com/playlist?list=PLLsor6GJ_BEEVWzDS3eHLdLkSZsoVnB98)
- Google Cloud
  - [Google Cloud Platform Blog](https://cloudplatform.googleblog.com/)
- Docker
  - [7 best practices for building containers](https://cloudplatform.googleblog.com/2018/07/7-best-practices-for-building-containers.html)
- Kubernetes
  - [Kubernetes For Developers (by nirmata): Pods (Part 1)](https://www.nirmata.com/2018/02/07/kubernetes-for-developers-pods-part-1/)
  - [Kubernetes For Developers (by nirmata): Part 2 – Replica Sets and Deployments](https://www.nirmata.com/2018/03/03/kubernetes-for-developers-part-2-replica-sets-and-deployments/)
  - [Kubernetes For Developers (by nirmata): Part 3 – Services](https://www.nirmata.com/2018/04/27/kubernetes-for-developers-part-3-services/)
  - [Kubernetes best practices: upgrading your clusters with zero downtime](https://cloudplatform.googleblog.com/2018/06/Kubernetes-best-practices-upgrading-your-clusters-with-zero-downtime.html)
  - [Deploying Java Applications with Docker and Kubernetes](https://www.oreilly.com/ideas/how-to-manage-docker-containers-in-kubernetes-with-java) & [oreilly-docker-java-shopping](https://github.com/vinicius3w/oreilly-docker-java-shopping)
  - [Deploying Java Applications with Kubernetes and an API Gateway](https://hackernoon.com/deploying-java-applications-with-kubernetes-and-an-api-gateway-fc471644bea7)
  - [Kubernetes Chaos Engineering: Lessons Learned — Part 1](https://learnk8s.io/blog/kubernetes-chaos-engineering-lessons-learned)
  - [Fundamentals of Containers, Kubernetes, and Red Hat OpenShift](https://courses.edx.org/courses/course-v1:RedHat+DO081x+2T2017/course/)
  - [LinuxFoundationX: LFS158x Introduction to Kubernetes](https://courses.edx.org/courses/course-v1:LinuxFoundationX+LFS158x+2T2017/course/)
- Microservices
  - [LinuxFoundationX: LFS132x Introduction to Cloud Foundry and Cloud Native Software Architecture](https://courses.edx.org/courses/course-v1:LinuxFoundationX+LFS132x+1T2017/course/)
  - [Architecting Distributed Cloud Applications](https://courses.edx.org/courses/course-v1:Microsoft+DEVOPS200.9x+1T2018/course/)
- Spring Boot
  - [Microservices and Cloud-Native Applications with Spring 5.0](https://www.packtpub.com/application-development/microservices-and-cloud-native-applications-spring-50-video)
  - [Advanced Spring Boot](https://www.packtpub.com/web-development/advanced-spring-boot-integrated-course)
  - [Source code from "Learning Spring Boot" (original and upgrades)](https://github.com/vinicius3w/learning-spring-boot-code)

### Business Cases

* [Monitoring containerized microservices with a centralized logging architecture](https://hackernoon.com/monitoring-containerized-microservices-with-a-centralized-logging-architecture-ba6771c1971a). A case study of Project Horus, Sep 12, 2018.
* The Smart Parking story - [Part 1](https://cloudplatform.googleblog.com/2018/04/Cloud-native-architecture-with-serverless-microservices-the-Smart-Parking-story.html), [Part2](https://cloudplatform.googleblog.com/2018/04/implementing-an-event-driven-architecture-on-serverless-the-Smart-Parking-story.html) and [Part 3](https://cloudplatform.googleblog.com/2018/04/what-we-learned-doing-serverless-the-Smart-Parking-story.html), Apr 12, 2018
* [Arquiteturas reativas e a experiência Mobile no Magazine Luiza](https://www.infoq.com/br/presentations/arquiteturas-reativas-e-a-experiencia-mobile-no-magazine-luiza), Jan 31, 2018.
* [Autorização de transações no Nubank: Consumindo serviços anos 80 com tecnologias atuais](https://www.infoq.com/br/presentations/consumindo-servicos-anos-80-com-tecnologias-atuais), Dec 06, 2017.
* [The Top 10 Adages in Continuous Deployment](https://www.infoq.com/articles/cd-adages), by InfoQ on Sep 19, 2017
* [Spotify Lessons: Learning to Let Go of Machines](https://www.infoq.com/presentations/spotify-infrastructure-deployment), by James Wen on Sep 19, 2017
* [How we build microservices at Karma](https://blog.karmawifi.com/how-we-build-microservices-at-karma-71497a89bfb4), Apr 4, 2016
* [Building Products at SoundCloud — Part I: Dealing with the Monolith](https://developers.soundcloud.com/blog/building-products-at-soundcloud-part-1-dealing-with-the-monolith), By Phil Calçado on June 11th, 2014
* [Building Products at SoundCloud—Part II: Breaking the Monolith](https://developers.soundcloud.com/blog/building-products-at-soundcloud-part-2-breaking-the-monolith), By Phil Calçado on June 12th, 2014
* [Preparing the Netflix API for Deployment](https://medium.com/netflix-techblog/preparing-the-netflix-api-for-deployment-786d8f58090d), by Netflix Technology Blog on Nov 18, 2013
* [Continuous Deployment at IMVU: Doing the Impossible Fifty Times a Day](http://timothyfitz.com/2009/02/10/continuous-deployment-at-imvu-doing-the-impossible-fifty-times-a-day/), by Timothy Fitz on February 10, 2009
* CA Technologies’ report gives some insights into business’ different understanding of DevOps and can be found at <http://www.ca.com/us/collateral/white-papers/na/techinsights-report-what-smart-businesses-know-about-devops.aspx>
* XebiaLabs has a wide range of surveys and state of industry reports on DevOps-related topics that can be found at <http://xebialabs.com/xl-resources/whitepapers/>

### Research Trends

- A. Balalaie, A. Heydarnoori and P. Jamshidi, "[Microservices Architecture Enables DevOps: Migration to a Cloud-Native Architecture](https://www.computer.org/csdl/mags/so/2016/03/mso2016030042-abs.html)," in IEEE Software, vol. 33, no. 3, pp. 42-52, 2016. doi:10.1109/MS.2016.64
- G. Pallis, D. Trihinas, A. Tryfonos and M. Dikaiakos, "[DevOps as a Service: Pushing the Boundaries of Microservice Adoption](https://doi.org/10.1109/MIC.2018.032501519)," in IEEE Internet Computing, vol. 22, no. 3, pp. 65-71, May./Jun. 2018. doi: 10.1109/MIC.2018.032501519
- D. Taibi and V. Lenarduzzi, "[On the Definition of Microservice Bad Smells](https://ieeexplore.ieee.org/document/8354414/?source=tocalert&dld=Y2luLnVmcGUuYnI%3D)," in IEEE Software, vol. 35, no. 3, pp. 56-62, May/June 2018. doi: 10.1109/MS.2018.2141031
- Garriga M. (2018) [Towards a Taxonomy of Microservices Architectures](https://link.springer.com/chapter/10.1007%2F978-3-319-74781-1_15). In: Cerone A., Roveri M. (eds) Software Engineering and Formal Methods. SEFM 2017. Lecture Notes in Computer Science, vol 10729. Springer, Cham
- M. Kassab, J. F. DeFranco and P. A. Laplante, "[Software Testing: The State of the Practice](http://ieeexplore.ieee.org/document/8048665/)," in IEEE Software, vol. 34, no. 5, pp. 46-52, 2017. doi: 10.1109/MS.2017.3571582
- R. Valerdi, "[Why Software Is Like Baseball](http://ieeexplore.ieee.org/document/8048622/)," in IEEE Software, vol. 34, no. 5, pp. 7-9, 2017. doi: 10.1109/MS.2017.3571583
- M. Kersten, "[Value Stream Architecture](http://ieeexplore.ieee.org/document/8048647/)," in IEEE Software, vol. 34, no. 5, pp. 10-12, 2017. doi: 10.1109/MS.2017.3571573
- E. Woods, "[Should Architects Code?](http://ieeexplore.ieee.org/document/8048649/)," in IEEE Software, vol. 34, no. 5, pp. 20-21, 2017. doi: 10.1109/MS.2017.3571574
- J. C. Carver, B. Penzenstadler, A. Serebrenik and A. Yamashita, "[The Human Factor](http://ieeexplore.ieee.org/document/8048655/)," in IEEE Software, vol. 34, no. 5, pp. 90-92, 2017. doi: 10.1109/MS.2017.3571580
- K. Carter, "[Francois Raynaud on DevSecOps](http://ieeexplore.ieee.org/document/8048652/)," in IEEE Software, vol. 34, no. 5, pp. 93-96, 2017. doi: 10.1109/MS.2017.3571578

### Objetivos

Espera-se que os alunos vivenciem exposição prática a ferramentas, processos e princípios do desenvolvimento de aplicações baseadas na arquitetura de microservices, juntamente com as boas práticas e técnicas de implantação nos princípios de DevOps e as vantagens e desafios do uso e imersão na Computação em Nuvem através de projetos práticos, enquanto compreendem modelos e ideias de pesquisa por trás das ferramentas e processos. As aulas incluirão experiências de aprendizagem no estilo de workshops, onde os alunos irão trabalhar em um problema e receberão comentários do professor, colaboradores convidados e outros colegas de classe. Quando possível, palestras convidadas da indústria ajudarão a ilustrar exemplos de como a tecnologia é implantada na prática.

### Metodologia

Na disciplina, será utilizada uma mistura de aulas tradicionais com atividades e workshops em sala de aula. Durante as aulas, abordaremos conceitos básicos relacionados aos tópicos a serem tratados na disciplina. Durante os workshops em sala de aula, realizaremos exemplos de exercícios com ferramentas relevantes que reforçam o material de aula. As avaliações serão baseadas nas aulas, exercícios dirigidos, workshops e o projeto final.

### Pré-Requisitos

Para participar deste curso é desejável que os participantes tenham:

- Conhecimento **básico de inglês técnico** para leitura, estudo e acompanhamento das atividades propostas, uma vez que a maior parte do material disponível está em inglês.
- Conhecimento básico de arquitetura de computador, sistemas operacionais, redes, engenharia de software e banco de dados.
- Conhecimento de modelos de processo de desenvolvimento de software, em especial Metodologias Ágeis, testes de software. Conhecimento em TDD e BDD serão uma vantagem. Maiores informações podem ser consultadas no site da disciplina de [Engenharia de Software (IF977)](http://www.cin.ufpe.br/~if977).
- Experiência em sistemas de computação, armazenamento, infraestruturas de rede e computação em nuvem será uma vantagem.

#### Artigos

* [An empirical study on principles and practices of continuous delivery and deployment](https://peerj.com/preprints/1889.pdf)
* [A biblioteca do Desenvolvedor de Software dos dias de hoje](http://vinicius3w.com/education/a-biblioteca-do-desenvolvedor-de-software-dos-dias-de-hoje/)
* [The Difference between SOA and Microservices?](https://www.infoq.com/news/2017/07/soaandmicroservices?utm_source=infoqEmail&utm_medium=SpecialNL_EditorialContent&utm_campaign=08242017_SpecialNL&forceSponsorshipId=1389)

### Avaliação

- **Projeto em equipe com até 3 membros** [70%]
  - Caráter puramente acadêmico e educacional. O projeto vai tratar de diversos aspectos do desenvolvimento de uma aplicação simples com arquitetura de microsserviços.
- Observações:
  - Entrega fora do prazo: **redutor de 1 ponto por dia de atraso**. 
  - Atraso máximo: **1 (uma) semana**. Após esse prazo, será dada nota **zero** para a respectiva atividade de avaliação.
  - Trabalhos com referências bibliográficas inconsistentes terão um redutor no conteúdo técnico. 
  - Trabalhos **“CTRL-C + CTRL-V”** terão nota **zero** (vale tanto para cópia de colegas, como para trabalhos copiados da internet).
- **Exercício Escolar Teórico Individual e/ou Atividades Práticas Individuais** [30%]
  - Exercício com questões objetivas
- Como atividade de recuperação é proposta a aplicação de um Exercício Escolar abordando os temas apresentados e discutidos em classe.

#### Projetos

- **2018.1**
  - Equipe [Porquin](https://github.com/IF1007/pqn-main)
  - Equipe [Scale](https://github.com/IF1007/if1007-scale)
  - Equipe [CSD (Catalog Series and Drama) Service](https://github.com/IF1007/catalog-service/)
  - Equipe [Horários acadêmicos](https://github.com/IF1007/horarios-academicos/tree/master/projeto)
  - Equipe [Wyatt](https://github.com/IF1007/wyatt)
  - Equipe [SWAN](https://github.com/IF1007/MS-ENTREGA)
  - Equipe [Hygieia Dashboard Clusterized on Kubernetes](https://github.com/IF1007/hygieia-k8s-cluster)
  - Equipe [Cartola-MicroServices](https://github.com/IF1007/Cartola-MicroServices)
  - Equipe [Greenhouse delivery](https://github.com/IF1007/Greenhouse-delivery)
  - Equipe [HAUL-AWS](https://github.com/IF1007/haul-aws)

### Recursos

- [IF1007 Slack team](http://if1007-2018-1.slack.com)
- [Pkay-with-docker](http://play-with-docker.com/): a simple, interactive and fun playground to learn Docker

### Tópicos

- Welcome, Methodology, Course Introduction (Core Topics)	               	
- Introduction to Microservices Concepts
- Demystifying Microservices
- Building Microservices with Spring Boot
- Applying Microservices Concepts
- Microservices Evolution – A Case Study
- Scaling Microservices with Spring Cloud
- Autoscaling Microservices
- Logging and Monitoring Microservices
- Containerizing Microservices with Docker
- Managing Dockerized Microservices with Mesos and Marathon
- Kubernetes orquestration enviroment
- The Microservices Development Life Cycle

### Plano de aulas

| # | Class    | Topics                               | Assignments       |
|:-:|:--------:|--------------------------------------|:-----------------:|
| 01 | Feb-26  | [Welcome, Methodology, Course Introduction (Core Topics)](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-01.pdf) |  |
| 02 | Feb-28  | [Introduction to Microservices Concepts](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-01.pdf) | [HW1](https://github.com/vinicius3w/if1007-Microservices/blob/master/hw/HW1.md) |
| 03 | Mar-05  | [Demystifying Microservices 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-02.pdf) |                   |
| 04 | Mar-07  | [Demystifying Microservices 2/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-02.pdf) | [HW2](https://github.com/vinicius3w/if1007-Microservices/blob/master/hw/HW2.md) |  |
| 05 | Mar-12  | [Building Microservices with Spring Boot 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-03.pdf) |                  |
| 06 | Mar-14  | [Building Microservices with Spring Boot 2/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-03.pdf) | [HW3](https://github.com/vinicius3w/if1007-Microservices/blob/master/hw/HW3.md) |
| 07 | Mar-19  | [Applying Microservices Concepts 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-04.pdf) |                  |
| 08 | Mar-21  | [Applying Microservices Concepts 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-04.pdf) | [HW4](https://github.com/vinicius3w/if1007-Microservices/blob/master/hw/HW4.md) |  |
| 09 | Mar-26  | [Microservices Evolution – A Case Study 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-05.pdf)  |                   |
| 10 | Mar-28  | [Microservices Evolution – A Case Study 2/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-05.pdf) | [HW5](https://github.com/vinicius3w/if1007-Microservices/blob/master/hw/HW5.md) |
| 11 | Apr-02  | [Scaling Microservices with Spring Cloud 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-06.pdf) |                   |
| 12 | Apr-04  | [Scaling Microservices with Spring Cloud 2/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-06.pdf) | [HW6](https://github.com/vinicius3w/if1007-Microservices/blob/master/hw/HW6.md) |
| 13 | Apr-09  | [Autoscaling Microservices 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-07.pdf) |                   |
| 14 | Apr-11  | [Autoscaling Microservices 2/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-07.pdf) | [HW7](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-07.pdf) |
| 15 | Apr-16  | [Background: Operations](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-09.pdf) ([Chapter 3 from Len Bass' book](https://www.amazon.com/DevOps-Software-Architects-Perspective-Engineering/dp/0134049845)) | [HW9](https://github.com/vinicius3w/if1007-Microservices/blob/master/hw/HW9.md) |
| 16 | Apr-18  | [The Deployment Pipeline](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-10.pdf) ([Chapter 4 from Len Bass' book](https://www.amazon.com/DevOps-Software-Architects-Perspective-Engineering/dp/0134049845)) |                   |
| 17 | Apr-23  | [Logging and Monitoring Microservices 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-08.pdf) |  |
| 18 | Apr-25  | [Logging and Monitoring Microservices 2/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-08.pdf) | [HW8](https://github.com/vinicius3w/if1007-Microservices/blob/master/hw/HW8.md) |
| 19 | Apr-30  | [Containerizing Microservices with Docker 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-11.pdf) |                   |
| 20 | May-02  | [Containerizing Microservices with Docker 2/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-11.pdf) | [HW11.1](https://github.com/vinicius3w/if1007-Microservices/blob/master/hw/HW11-1.md), [HW11.2](https://github.com/vinicius3w/if1007-Microservices/blob/master/hw/HW11-2.md) |
| 21 | May-07  | [Managing Dockerized Microservices with Mesos and Marathon 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-12.pdf) |                   |
| 22 | May-09  | [Managing Dockerized Microservices with Mesos and Marathon 2/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-12.pdf) | [HW12](https://github.com/vinicius3w/if1007-Microservices/blob/master/hw/HW12.md) |
| 23 | May-14  | [Introduction to Kubernetes 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-13.pdf) |                   |
| 24 | May-16  | [Introduction to Kubernetes 2/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-13.pdf) |                   |
| 25 | May-21  | [The Microservices Development Life Cycle 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-14.pdf) |                   |
| 26 | May-23  | [The Microservices Development Life Cycle 2/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-14.pdf) |                   |
| 27 | May-28  | Project execution time |                   |
| 28 | May-30  | Follow-up of project execution |                   |
| 29 | Jun-04  | Project execution time |                   |
| 30 | Jun-06  | Follow-up of project execution  |                   |
| 31 | Jun-11  | Project execution time |                   |
| 32 | Jun-13  | Follow-up of project execution |                   |
| 33 | Jun-18  | Project presentation |                   |
| 34 | Jun-20  | Project presentation |                   |
| 35 | Jun-25  |                                      |                   |
| 36 | Jun-27  | Publication of final results |                   |

### Disciplinas correlatas e/ou influenciadas

Após a iniciativa de construção desta disciplina, outras nasceram motivadas por este movimento ou inspiradas nos tópicos aqui cobertos. São elas:

- [Desmistificando DevOps: Projetando Arquiteturas Efetivamente Escaláveis](https://github.com/vinicius3w/if1004-DevOps), [Prof. Vinicius Garcia](http://viniciusgarcia.me), [Centro de Informática](http://www.cin.ufpe.br) - UFPE
- [Programação para a Web 2](https://github.com/diegoep/pweb2), [Prof. Diego Pessoa](https://github.com/diegoep), CST em Análise e Desenvolvimento de Sistemas, [IFPB - Campus Cajazeiras](http://ifpb.edu.br/cajazeiras)
