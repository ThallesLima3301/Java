# Projeto Prático - Azure AI Search

## 🔍 Objetivo
Explorar e configurar um **Azure Cognitive Search Index** para construir uma solução de busca inteligente, aplicando conceitos de **Inteligência Artificial** e **análise semântica** de dados.

---

## 🚀 Passo a Passo para Configurar a Pesquisa

1. Acesse o portal do Azure: [portal.azure.com](https://portal.azure.com)
2. Crie um recurso do tipo **Azure Cognitive Search**
3. Dentro do recurso:
   - Vá em **Import data**
   - Escolha a fonte de dados (pode ser um blob storage, SQL Database, etc.)
   - Configure o **Indexer** (quem coleta os dados)
   - Configure o **Skillset** (opcional, para aplicar IA: OCR, detecção de linguagem, etc.)
   - Configure o **Index** (estrutura da pesquisa)
   - Finalize e aguarde o indexamento

4. Use o **Search Explorer** na interface do portal para fazer consultas e testar a busca inteligente.

---

## 🧠 Insights e Possibilidades

- Ferramentas como **chatbots**, **sistemas de busca empresarial**, **e-commerces** e **painéis de BI** podem se beneficiar da integração com Azure Search.
- Os recursos de IA permitem enriquecer os dados com informações contextuais, como:
  - Detecção de idioma
  - Análise de sentimentos
  - Extração de entidades
  - OCR em imagens

---

## 🛠️ Ferramentas Utilizadas

- [Azure Portal](https://portal.azure.com)
- Azure Cognitive Search
- Azure AI Services (Skillsets)

---

## 📸 Prints do Processo

*Resultado da configuração e consulta no Search Explorer:*

![Print do Search Explorer](./imagens/resultados-pesquisa.png)

---

## 📚 Aprendizados

- Aprendi como montar um índice de busca com inteligência artificial no Azure.
- Entendi como conectar dados, aplicar análises semânticas e criar pesquisas contextuais.
- Vi como essa ferramenta pode ser integrada com front-ends, bots e sistemas de recomendação.

---

## 💼 Possibilidades Futuras

- Integrar com uma aplicação web (ex: React + API REST).
- Aplicar filtros por facetas (categorias, datas, etc).
- Usar com dados não estruturados como PDFs, imagens e documentos.

