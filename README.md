# 📋  DESAFIO TÉCNICO ELDORADO - ✅ Concluído

## 🎯 Visão Geral
Projeto **Android em Kotlin** com pipeline **CI/CD completo** desenvolvido para o processo seletivo **ELDORADO**.

---

## Diagrama do Projeto
<img width="871" height="465" alt="image" src="https://github.com/user-attachments/assets/d63194d6-6c8f-4c61-ab10-237c4fc93986" />



## ✅ Requisitos Implementados

### 🔧 Obrigatórios
- Pipeline **CI/CD com GitHub Actions** - fluxo automatizado completo  
- **Build da aplicação** → `./gradlew assembleDebug`  
- **Execução de testes unitários** → `./gradlew testDebugUnitTest`  
- **Análise estática (Lint)** → `./gradlew lintDebug`  
- **Geração de APK** → artefato `app-debug-apk` (6.05 MB)  
- **Publicação de artefatos** → upload automático no GitHub Actions  

### 🎁 Bônus Implementados
- **Análise estática (Lint)** → relatório `lint-report` (16.7 KB)  
- **Cobertura de testes (JaCoCo)** → relatório `coverage-report` (35.5 KB)  
- **Caching de dependências** → otimização do tempo de build  
- **Firebase App Distribution** → configurado para deploy  

---

## 📦 Artefatos Gerados

| Artefato         | Descrição                | Tamanho  | Status |
|------------------|--------------------------|----------|--------|
| `app-debug-apk`  | APK para instalação      | 6.05 MB  | ✅      |
| `coverage-report`| Relatório JaCoCo         | 35.5 KB  | ✅      |
| `lint-report`    | Análise estática         | 16.7 KB  | ✅      |

---

## 🚀 Como Executar

### Localmente
```bash
# Clone o projeto
git clone <url-do-repositorio>

# Execute testes com cobertura
./gradlew testDebugUnitTest jacocoTestReport

# Gere APK debug
./gradlew assembleDebug

# Execute análise estática
./gradlew lintDebug

No CI/CD

O pipeline é executado automaticamente em cada push para a branch main:

✅ Setup do ambiente (JDK 17 + Android SDK)

✅ Execução de testes unitários

✅ Geração de relatório de cobertura

✅ Análise estática com Lint

✅ Build do APK debug

✅ Upload de artefatos



📂 .github/workflows/
 └── 📄 android-ci.yml   # Pipeline principal
 
📂 app/build/reports/
 ├── 📂 jacoco/          # Relatórios de cobertura
 ├── 📂 lint/            # Análise estática
 └── 📂 tests/           # Relatórios de testes


🔗 Links Úteis

Workflow: GitHub Actions

Relatórios: disponíveis como artefatos após cada execução

APK: download disponível na seção de artifacts

📈 Próximas Melhorias

Implementar OWASP Dependency Check

Aumentar cobertura de testes

Adicionar testes de integração

Implementar deploy automático para produção

🎉 Status Final

PROJETO CONCLUÍDO COM SUCESSO!
Todos os requisitos obrigatórios e bônus foram implementados. 🚀


Quer que eu adicione também **badges** (por exemplo, status do CI, linguagem usada, versão do Gradle) para deixar o README ainda mais profissional?
