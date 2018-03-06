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

### Ementa

Microservice é um estilo e padrão de arquitetura de software em que sistemas complexos são decompostos em serviços menores que trabalham em conjunto para formar serviços maiores. Os Microservices são serviços autônomos, independentes e independentemente implantáveis. No mundo de hoje, muitas empresas usam microservices como principal padrão para a construção de aplicativos corporativos grandes e orientados a serviços.

O framework [Spring](https://spring.io) é um framework de programação popular com a comunidade de desenvolvedores por muitos anos. O [Spring Boot](https://projects.spring.io/spring-boot/) removeu a necessidade de ter um conteiner leve de aplicação e forneceu um meio para implantar aplicativos leves e sem servidor. O [Spring Cloud](https://projects.spring.io/spring-cloud/) combina muitos componentes e junto com o [OSS Netflix](https://netflix.github.io/) e fornece um ecossistema para executar e gerenciar microservices em grande escala. Ele fornece recursos como balanceamento de carga, registro de serviço, monitoramento, gateway de serviço e assim por diante.

No entanto, os microservices vêm com seus próprios desafios, como monitoramento, gerenciamento, distribuição, dimensionamento, descoberta, etc., especialmente quando se implanta em escala. A adoção de microservices sem abordar os desafios dos microservices comuns levaria a resultados catastróficos. A parte mais importante deste curso é discutir um modelo de capacidade de microservice agnóstico em termos de tecnologia que busca ajudar a resolver os desafios mais comuns do mundo de microservice.

### Bibliografia Sugerida

Não há livro texto obrigatório. Entretanto, a seguir estão alguns livros que podem ser recomendados:

- [Building Microservices: Designing Fine-Grained Systems](https://www.amazon.com/Building-Microservices-Designing-Fine-Grained-Systems/dp/1491950358)

### Bibliografia Complementar

- [Spring Microservices](https://www.packtpub.com/application-development/spring-microservices)
- [Spring Boot: Acelere o desenvolvimento de microsserviços](https://www.casadocodigo.com.br/products/livro-spring-boot)
- [Microservices for Java Developers A Hands-on Introduction to Frameworks and Containers](https://developers.redhat.com/promotions/microservices-for-java-developers/)
- [Migrating to Cloud-Native Application Architectures](http://www.oreilly.com/programming/free/migrating-cloud-native-application-architectures.csp)
- [Continous Integration](https://www.amazon.com/Continuous-Integration-Improving-Software-Reducing/dp/0321336380)

### Bibliografia sobre Ferramentas, Frameworks e Tecnologias

- [Spring framework](https://spring.io/)
- [Spring Boot](https://projects.spring.io/spring-boot/)
- [Spring Cloud](https://projects.spring.io/spring-cloud/)
- [Netflix Open Source Software Center](https://netflix.github.io/)
- [The InfoQ eMag: Microservices vs. Monoliths - The Reality Beyond the Hype](https://www.infoq.com/minibooks/emag-microservices-monoliths)
- [Production-Ready Microservices - Building Standardized Systems Across an Engineering Organization](http://shop.oreilly.com/product/0636920053675.do)
- [Microservices vs. Service-Oriented Architecture](https://www.nginx.com/resources/library/microservices-vs-soa/)
- [Systems Performance: Enterprise and the Cloud](http://www.brendangregg.com/sysperfbook.html)
- [Designing Data-Intensive Applications](http://www.dataintensive.net/)
- [Continous Delivery](http://www.continuousdelivery.com)
- [The Evolution of DevSecOps Revisited](https://cloudsentry.evident.io/evolution-devsecops-revisited/)
- [Containers com Docker: Do desenvolvimento à produção](https://www.casadocodigo.com.br/products/livro-docker)
- [Ansible: Up and Running](http://www.ansiblebook.com/)
- [Docker Tutorials and Labs](https://github.com/docker/labs) (This repo contains Docker labs and tutorials authored both by Docker, and by members of the community)
- [Entrega contínua em Android: Como automatizar a distribuição de apps](https://www.casadocodigo.com.br/products/livro-entrega-continua-android)
- [Jenkins: Automatize tudo sem complicações](https://www.casadocodigo.com.br/products/livro-jenkins)
- [Testes automatizados de software: Um guia prático](https://www.casadocodigo.com.br/products/livro-testes-de-software)
- [Test-Driven Development: Teste e Design no Mundo Real](https://www.casadocodigo.com.br/products/livro-tdd)
- [Cloud Computing: Concepts, Technology & Architecture](http://www.amazon.com/Cloud-Computing-Practice-Dan-Marinescu/dp/0124046274)
- [Four Layers of TCP/IP model, Comparison and Difference between TCP/IP and OSI models](http://www.omnisecu.com/tcpip/tcpip-model.php)
- [Travis CI](https://travis-ci.org/), Test and Deploy with Confidence
- [From open source to sustainable success: the Kubernetes graduation story](http://cloudplatform.googleblog.com/2018/03/from-open-source-to-sustainable-success-the-Kubernetes-graduation-story.html)

### Blogs, Disciplinas, Treinamentos

- [Microservices for Digital Transformation - case studies across ERP, Entertainment, Finance, Search, Auctions, and Cloud Industries](https://www.linkedin.com/pulse/microservices-digital-transformation-case-studies-erp-yerramsetti/)
- [Why Microservices Should Be Event Driven: Autonomy vs Authority](http://blog.christianposta.com/microservices/why-microservices-should-be-event-driven-autonomy-vs-authority/)
- [3 Easy Things to Do to Make Your Microservices More Resilient](http://blog.christianposta.com/microservices/3-easy-things-to-do-to-make-your-microservices-more-resilient/)
- [The Hardest Part About Microservices: Your Data](http://blog.christianposta.com/microservices/the-hardest-part-about-microservices-data/)
- [Carving the Java EE Monolith Into Microservices: Prefer Verticals Not Layers](https://developers.redhat.com/blog/2016/07/07/carving-the-java-ee-monolith-into-microservices-prefer-verticals-not-layers/)
- [Source code from "Learning Spring Boot" (original and upgrades)](https://github.com/vinicius3w/learning-spring-boot-code)
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
- [Google Cloud Platform Blog](https://cloudplatform.googleblog.com/)
- [DevOps | AWS Cloud | Cloud Tutorials for Beginners](https://www.youtube.com/playlist?list=PLLsor6GJ_BEEVWzDS3eHLdLkSZsoVnB98)
- [Microservices and Cloud-Native Applications with Spring 5.0](https://www.packtpub.com/application-development/microservices-and-cloud-native-applications-spring-50-video)
- [Advanced Spring Boot](https://www.packtpub.com/web-development/advanced-spring-boot-integrated-course)
- [Arquiteturas reativas e a experiência Mobile no Magazine Luiza](https://www.infoq.com/br/presentations/arquiteturas-reativas-e-a-experiencia-mobile-no-magazine-luiza)
- [Autorização de transações no Nubank: Consumindo serviços anos 80 com tecnologias atuais](https://www.infoq.com/br/presentations/consumindo-servicos-anos-80-com-tecnologias-atuais)
- [De monolítico a cloud native: uma jornada de erros e acertos na Wine.com.br](https://www.infoq.com/br/presentations/de-monolitico-a-cloud-native-uma-jornada-de-erros-e-acertos)
- [Desenvolvendo, expandindo e amadurecendo a prática de Engenharia de Caos](https://www.infoq.com/br/articles/engenharia-de-caos)

### Business Cases

- [Building Products at SoundCloud — Part I: Dealing with the Monolith](https://developers.soundcloud.com/blog/building-products-at-soundcloud-part-1-dealing-with-the-monolith), By Phil Calçado on June 11th, 2014
- [Building Products at SoundCloud—Part II: Breaking the Monolith](https://developers.soundcloud.com/blog/building-products-at-soundcloud-part-2-breaking-the-monolith), By Phil Calçado on June 12th, 2014
- [How we build microservices at Karma](https://blog.karmawifi.com/how-we-build-microservices-at-karma-71497a89bfb4), Apr 4, 2016
- [The Top 10 Adages in Continuous Deployment](https://www.infoq.com/articles/cd-adages), by InfoQ on Sep 19, 2017
- [Spotify Lessons: Learning to Let Go of Machines](https://www.infoq.com/presentations/spotify-infrastructure-deployment), by James Wen on Sep 19, 2017

### Research Trends

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
- The Microservices Development Life Cycle

### Plano de aulas

| # | Class    | Topics                               | Resources  | Assignments       |
|:-:|:--------:|--------------------------------------|:-----------:|:-----------------:|
| 01 | Feb-26  | [Welcome, Methodology, Course Introduction (Core Topics)](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-01.pdf) |                 |  |
| 02 | Feb-28  | [Introduction to Microservices Concepts](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-01.pdf) |                 | [HW1](https://github.com/vinicius3w/if1007-Microservices/blob/master/hw/HW1.md) |
| 03 | Mar-05  | [Demystifying Microservices 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-02.pdf) |                 |                   |
| 04 | Mar-07  | [Demystifying Microservices 2/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-02.pdf) |                 | [HW2](https://github.com/vinicius3w/if1007-Microservices/blob/master/hw/HW2.md) |
| 05 | Mar-12  | [Building Microservices with Spring Boot 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-03.pdf) |                 |                   |
| 06 | Mar-14  | [Building Microservices with Spring Boot 2/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-03.pdf) |                 | [HW3](https://github.com/vinicius3w/if1007-Microservices/blob/master/hw/HW3.md) |
| 07 | Mar-19  | [Applying Microservices Concepts 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-04.pdf) |                 |                   |
| 08 | Mar-21  | [Applying Microservices Concepts 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-04.pdf) |                 | [HW4](https://github.com/vinicius3w/if1007-Microservices/blob/master/hw/HW4.md) |
| 09 | Mar-26  | [Microservices Evolution – A Case Study 1/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-05.pdf) |                 |                   |
| 10 | Mar-28  | [Microservices Evolution – A Case Study 2/2](https://github.com/vinicius3w/if1007-Microservices/blob/master/lectures/if1007-microservices-05.pdf) |                 | [HW5](https://github.com/vinicius3w/if1007-Microservices/blob/master/hw/HW5.md) |
| 11 | Apr-02  | Scaling Microservices with Spring Cloud 1/2 |                 |                   |
| 12 | Apr-04  | Scaling Microservices with Spring Cloud 1/2 |                 |                   |
| 13 | Apr-09  | Autoscaling Microservices 1/2 |                 |                   |
| 14 | Apr-11  | Autoscaling Microservices 2/2 |                 |                   |
| 15 | Apr-16  | Logging and Monitoring Microservices 1/2 |                 |                   |
| 16 | Apr-18  | Logging and Monitoring Microservices 2/2 |                 |                   |
| 17 | Apr-23  | Containerizing Microservices with Docker 1/2 |                 |                   |
| 18 | Apr-25  | Containerizing Microservices with Docker 2/2 |                 |                   |
| 19 | Apr-30  | Managing Dockerized Microservices with Mesos and Marathon 1/2 |                 |                   |
| 20 | May-02  | Managing Dockerized Microservices with Mesos and Marathon 2/2 |                 |                   |
| 21 | May-07  | The Microservices Development Life Cycle 1/2 |                 |                   |
| 22 | May-09  | The Microservices Development Life Cycle 2/2 |                 |                   |
| 23 | May-14  |                                      |                 |                   |
| 24 | May-16  |                                      |                 |                   |
| 25 | May-21  |                                      |                 |                   |
| 26 | May-23  |                                      |                 |                   |
| 27 | May-28  |                                      |                 |                   |
| 28 | May-30  |                                      |                 |                   |
| 29 | Jun-04  |                                      |                 |                   |
| 30 | Jun-06  |                                      |                 |                   |
| 31 | Jun-11  |                                      |                 |                   |
| 32 | Jun-13  |                                      |                 |                   |
| 33 | Jun-18  |                                      |                 |                   |
| 34 | Jun-20  |                                      |                 |                   |
| 35 | Jun-25  |                                      |                 |                   |
| 36 | Jun-27  |                                      |                 |                   |
| 37 | Jul-02  |                                      |                 |                   |
| 38 | Jul-04  |                                      |                 |                   |
| 39 | Jul-09  |                                      |                 |                   |
| 40 | Jul-11  |                                      |                 |                   |
