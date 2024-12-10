# 🎧 Convertify

Convertify é um conversor de áudio simples desenvolvido em **Java** que permite converter arquivos de áudio entre diferentes formatos, como **MP3**, **M4A**, **WAV**, **OGG** e **FLAC**. O projeto utiliza o **FFmpeg**, uma poderosa biblioteca de conversão de mídia, para realizar as conversões de maneira eficiente. 🎵

## Funcionalidades

- 🔄 Conversão de arquivos de áudio entre os formatos: **MP3**, **M4A**, **WAV**, **OGG** e **FLAC**.
- 🖥️ Interface gráfica simples e intuitiva construída com **Swing**.
- 📂 Suporte a seleção de arquivos de entrada e saída diretamente pela interface.
- 📊 Exibição de mensagens de progresso e status durante a conversão.

## Requisitos

Para rodar este projeto, você precisa ter o **FFmpeg** instalado em seu computador. Siga os passos abaixo para configurar:

### 1. Baixar o FFmpeg

   - 🌐 Acesse [FFmpeg.org](https://ffmpeg.org/download.html) e baixe a versão apropriada para o seu sistema operacional.
   - 📂 Extraia o conteúdo do arquivo baixado em uma pasta de sua escolha.

### 2. Definir o Caminho do FFmpeg no Projeto

   - No código, altere o caminho para o executável do FFmpeg para apontar para o local onde você extraiu o FFmpeg. O caminho padrão no código é:
     ```java
     String ffmpegPath = "C:\\ffmpeg-master-latest-win64-gpl\\ffmpeg-master-latest-win64-gpl\\bin\\ffmpeg.exe";
     ```
   - Certifique-se de que o caminho do FFmpeg está correto para o seu sistema.

## Como Usar

1. **Abra o Convertify**: Compile e execute o projeto no NetBeans ou em sua IDE de preferência. 💻
2. **Selecione um Arquivo de Áudio**: Escolha o arquivo de áudio que deseja converter. 🎶
3. **Escolha o Formato de Saída**: Selecione o formato de áudio para o qual deseja converter (MP3, M4A, WAV, OGG ou FLAC). 🔄
4. **Defina o Diretório de Saída**: Escolha a pasta onde o arquivo convertido será salvo. 📂
5. **Inicie a Conversão**: Clique no botão de conversão e aguarde até que a conversão seja concluída. ⏳
6. **Verifique o Resultado**: O arquivo convertido será salvo no diretório de saída. ✅

## Como Contribuir

1. 🍴 Faça um **fork** deste repositório.
2. 🌱 Crie uma branch para sua alteração (`git checkout -b feature-nome-da-feature`).
3. 💻 Faça o **commit** das suas alterações (`git commit -am 'Adicionar nova funcionalidade'`).
4. 🚀 **Push** para a branch do seu fork (`git push origin feature-nome-da-feature`).
5. 🔄 Abra um **pull request**.

## Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo [LICENSE](LICENSE) para mais detalhes. 📄

## Agradecimentos

- 🎬 **FFmpeg**: Para conversão de mídia de alta performance.
- 🖥️ **NetBeans**: Para o desenvolvimento da interface gráfica do projeto.
- ☕ **Java**: Pela poderosa plataforma de desenvolvimento.

## Demonstração

![Demo](![convertify](https://github.com/user-attachments/assets/2cf373e0-b8be-4509-be38-d98eba4106f4)
)

---

Se você tiver dúvidas ou sugestões, fique à vontade para abrir uma issue ou enviar um pull request. 😊
